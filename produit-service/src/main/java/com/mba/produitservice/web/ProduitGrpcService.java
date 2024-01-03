package com.mba.produitservice.web;

import com.mba.produitservice.entities.Produit;
import com.mba.produitservice.mappers.ProduitMapper;
import com.mba.produitservice.repositories.ProduitRepository;
import com.mba.produitservice.stubs.ProduitOuterClass;
import com.mba.produitservice.stubs.ProduitServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ProduitGrpcService extends ProduitServiceGrpc.ProduitServiceImplBase {
    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private ProduitMapper produitMapper;


    @Override
    public void getAllProduit(ProduitOuterClass.GetAllProduitRequest request, StreamObserver<ProduitOuterClass.GetAllProduitResponse> responseObserver) {
        List<Produit> produits = produitRepository.findAll();
        List<ProduitOuterClass.Produit> grpcProduits = produits.stream()
                .map(produitMapper::produit2grpcProduit)
                .collect(Collectors.toList());
        ProduitOuterClass.GetAllProduitResponse produitsResponse = ProduitOuterClass
                .GetAllProduitResponse
                .newBuilder()
                .addAllProduits(grpcProduits)
                .build();
        responseObserver.onNext(produitsResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void getOneProduit(ProduitOuterClass.GetOneProduitRequest request, StreamObserver<ProduitOuterClass.GetOneProduitResponse> responseObserver) {
        Produit produit = produitRepository.findById(request.getIdp()).get();
        ProduitOuterClass.GetOneProduitResponse response = ProduitOuterClass.GetOneProduitResponse
                .newBuilder()
                .setProduit(produitMapper.produit2grpcProduit(produit))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveProduit(ProduitOuterClass.SaveProduitRequest request, StreamObserver<ProduitOuterClass.SaveProduitResponse> responseObserver) {
        Produit produit = produitMapper.grpcProduit2Produit(request.getProduitRequest());
        Produit savedProduit = produitRepository.save(produit);
        ProduitOuterClass.SaveProduitResponse response = ProduitOuterClass.SaveProduitResponse
                .newBuilder()
                .setProduit(produitMapper.produit2grpcProduit(savedProduit))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateProduit(ProduitOuterClass.UpdateProduitRequest request, StreamObserver<ProduitOuterClass.UpdateProduitResponse> responseObserver) {
        Produit produit = produitRepository.findById(request.getIdp()).get();
        Produit updatedProduit = produitMapper.grpcProduit2Produit(request.getProduitRequest());

        if (updatedProduit.getMarque() != "") produit.setMarque(updatedProduit.getMarque());
        if (updatedProduit.getDesc() != "") produit.setDesc(updatedProduit.getDesc());
        if (updatedProduit.getPrix() != null) produit.setPrix(updatedProduit.getPrix());
        if (updatedProduit.getQuantite() != null) produit.setQuantite(updatedProduit.getQuantite());


        Produit savedProduit = produitRepository.save(produit);
        ProduitOuterClass.UpdateProduitResponse response = ProduitOuterClass.UpdateProduitResponse
                .newBuilder()
                .setProduit(produitMapper.produit2grpcProduit(savedProduit))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteProduit(ProduitOuterClass.DeleteProduitRequest request, StreamObserver<ProduitOuterClass.DeleteProduitResponse> responseObserver) {
        Produit produit = produitRepository.findById(request.getIdp()).get();
        produitRepository.deleteById(request.getIdp());
        ProduitOuterClass.DeleteProduitResponse response = ProduitOuterClass.DeleteProduitResponse
                .newBuilder()
                .setMessage("Produit (" + produit.getIdp() + "," + produit.getMarque() + ") supprimé avec succès")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


}
