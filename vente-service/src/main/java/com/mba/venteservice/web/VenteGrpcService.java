package com.mba.venteservice.web;

import com.mba.acheteurservice.stubs.AcheteurOuterClass;
import com.mba.acheteurservice.stubs.AcheteurServiceGrpc;
import com.mba.produitservice.stubs.ProduitOuterClass;
import com.mba.produitservice.stubs.ProduitServiceGrpc;
import com.mba.venteservice.entities.Vente;
import com.mba.venteservice.mappers.AcheteurMapper;
import com.mba.venteservice.mappers.ProduitMapper;
import com.mba.venteservice.mappers.VenteMapper;
import com.mba.venteservice.repositories.VenteRepository;
import com.mba.venteservice.stubs.VenteOuterClass;
import com.mba.venteservice.stubs.VenteServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class VenteGrpcService extends VenteServiceGrpc.VenteServiceImplBase {
    @Autowired
    private VenteRepository venteRepository;
    @Autowired
    private VenteMapper venteMapper;

    private AcheteurOuterClass.Acheteur getAcheteurForVente(int ida) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091)
                .usePlaintext()
                .build();
        AcheteurServiceGrpc.AcheteurServiceBlockingStub acheteurStub = AcheteurServiceGrpc.newBlockingStub(channel);
        AcheteurOuterClass.GetOneAcheteurRequest requestAcheteur = AcheteurOuterClass.GetOneAcheteurRequest.newBuilder().setIda(ida).build();
        AcheteurOuterClass.GetOneAcheteurResponse responseAcheteur = acheteurStub.getOneAcheteur(requestAcheteur);
        AcheteurOuterClass.Acheteur acheteur = responseAcheteur.getAcheteur();
        channel.shutdown();

        return acheteur;
    }

    private ProduitOuterClass.Produit getProduitForVente(int idp) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();
        ProduitServiceGrpc.ProduitServiceBlockingStub produitStub = ProduitServiceGrpc.newBlockingStub(channel);
        ProduitOuterClass.GetOneProduitRequest requestProduit = ProduitOuterClass.GetOneProduitRequest.newBuilder().setIdp(idp).build();
        ProduitOuterClass.GetOneProduitResponse responseProduit = produitStub.getOneProduit(requestProduit);
        ProduitOuterClass.Produit produit = responseProduit.getProduit();
        channel.shutdown();
        return produit;
    }


    @Override
    public void getAllVente(VenteOuterClass.GetAllVenteRequest request, StreamObserver<VenteOuterClass.GetAllVenteResponse> responseObserver) {


        List<Vente> ventes = venteRepository.findAll();
        List<VenteOuterClass.Vente> grpcVentes = ventes.stream()
                .map(vente -> {
                    AcheteurOuterClass.Acheteur acheteur = getAcheteurForVente(vente.getIda());
                    ProduitOuterClass.Produit produit = getProduitForVente(vente.getIdp());
                    return VenteOuterClass.Vente.newBuilder()
                            .setIdv(vente.getIdv())
                            .setIda(vente.getIda())
                            .setIdp(vente.getIdp())
                            .setQuantite(vente.getQuantite())
                            .setMois(vente.getMois())
                            .setAnnee(vente.getAnnee())
                            .setAcheteur(acheteur)
                            .setProduit(produit)
                            .build();
                })
                .collect(Collectors.toList());

        VenteOuterClass.GetAllVenteResponse response = VenteOuterClass.GetAllVenteResponse.newBuilder()
                .addAllVentes(grpcVentes)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void getOneVente(VenteOuterClass.GetOneVenteRequest request, StreamObserver<VenteOuterClass.GetOneVenteResponse> responseObserver) {
        Vente vente = venteRepository.findById((int) request.getIdv()).get();

        AcheteurOuterClass.Acheteur acheteur = getAcheteurForVente(vente.getIda());
        ProduitOuterClass.Produit produit = getProduitForVente(vente.getIdp());

        VenteOuterClass.Vente grpcVente = VenteOuterClass.Vente.newBuilder()
                .setIdv(vente.getIdv())
                .setIda(vente.getIda())
                .setIdp(vente.getIdp())
                .setQuantite(vente.getQuantite())
                .setMois(vente.getMois())
                .setAnnee(vente.getAnnee())
                .setAcheteur(acheteur)
                .setProduit(produit)
                .build();

        VenteOuterClass.GetOneVenteResponse response = VenteOuterClass.GetOneVenteResponse.newBuilder()
                .setVente(grpcVente)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveVente(VenteOuterClass.SaveVenteRequest request, StreamObserver<VenteOuterClass.SaveVenteResponse> responseObserver) {
        Vente vente = venteMapper.grpcVente2Vente(request.getVenteRequest());
        Vente savedVente = venteRepository.save(vente);
        VenteOuterClass.SaveVenteResponse response = VenteOuterClass.SaveVenteResponse
                .newBuilder()
                .setVente(venteMapper.vente2grpcVente(savedVente))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void updateVente(VenteOuterClass.UpdateVenteRequest request, StreamObserver<VenteOuterClass.UpdateVenteResponse> responseObserver) {
        Vente vente = venteRepository.findById((int) request.getIdv()).get();
        Vente updatedVente = venteMapper.grpcVente2Vente(request.getVenteRequest());
        //if(updatedVente.getIdp()!=null)      vente.setIdp(updatedVente.getIdp());
        vente.setIdp(updatedVente.getIdp());
        vente.setIda(updatedVente.getIda());
        vente.setMois(updatedVente.getMois());
        vente.setAnnee(updatedVente.getAnnee());
        vente.setQuantite(updatedVente.getQuantite());


        Vente savedVente = venteRepository.save(vente);
        VenteOuterClass.UpdateVenteResponse response = VenteOuterClass.UpdateVenteResponse
                .newBuilder()
                .setVente(venteMapper.vente2grpcVente(savedVente))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteVente(VenteOuterClass.DeleteVenteRequest request, StreamObserver<VenteOuterClass.DeleteVenteResponse> responseObserver) {
        Vente vente = venteRepository.findById((int) request.getIdv()).get();
        venteRepository.deleteById((int) request.getIdv());
        VenteOuterClass.DeleteVenteResponse response = VenteOuterClass.DeleteVenteResponse
                .newBuilder()
                .setMessage("Vente " + vente.getIdv() + ") supprimé avec succès")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


}

