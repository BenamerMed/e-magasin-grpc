package com.mba.acheteurservice.web;

import com.mba.acheteurservice.entities.Acheteur;
import com.mba.acheteurservice.mappers.AcheteurMapper;
import com.mba.acheteurservice.repositories.AcheteurRepository;
import com.mba.acheteurservice.stubs.AcheteurOuterClass;
import com.mba.acheteurservice.stubs.AcheteurServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class AcheteurGrpcService extends AcheteurServiceGrpc.AcheteurServiceImplBase {
    @Autowired
    private AcheteurRepository acheteurRepository;
    @Autowired
    private AcheteurMapper acheteurMapper;

    @Override
    public void getAllAcheteur(AcheteurOuterClass.GetAllAcheteurRequest request, StreamObserver<AcheteurOuterClass.GetAllAcheteurResponse> responseObserver) {
        List<Acheteur> acheteurs = acheteurRepository.findAll();
        List<AcheteurOuterClass.Acheteur> grpcAcheteurs = acheteurs.stream()
                .map(acheteurMapper::acheteur2grpcAcheteur)
                .collect(Collectors.toList());

        // Création de la réponse contenant tous les acheteurs convertis en gRPC
        AcheteurOuterClass.GetAllAcheteurResponse acheteursResponse = AcheteurOuterClass
                .GetAllAcheteurResponse
                .newBuilder()
                .addAllAcheteurs(grpcAcheteurs)
                .build();

        // Envoi de la réponse au client gRPC
        responseObserver.onNext(acheteursResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void getOneAcheteur(AcheteurOuterClass.GetOneAcheteurRequest request, StreamObserver<AcheteurOuterClass.GetOneAcheteurResponse> responseObserver) {
        Acheteur acheteur = acheteurRepository.findById(request.getIda()).get();
        AcheteurOuterClass.GetOneAcheteurResponse response = AcheteurOuterClass.GetOneAcheteurResponse
                .newBuilder()
                .setAcheteur(acheteurMapper.acheteur2grpcAcheteur(acheteur))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void saveAcheteur(AcheteurOuterClass.SaveAcheteurRequest request, StreamObserver<AcheteurOuterClass.SaveAcheteurResponse> responseObserver) {
        Acheteur acheteur = acheteurMapper.grpcAcheteur2Acheteur(request.getAcheteurRequest());
        Acheteur savedAcheteur = acheteurRepository.save(acheteur);
        AcheteurOuterClass.SaveAcheteurResponse response = AcheteurOuterClass.SaveAcheteurResponse
                .newBuilder()
                .setAcheteur(acheteurMapper.acheteur2grpcAcheteur(savedAcheteur))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateAcheteur(AcheteurOuterClass.UpdateAcheteurRequest request, StreamObserver<AcheteurOuterClass.UpdateAcheteurResponse> responseObserver) {
        Acheteur acheteur = acheteurRepository.findById(request.getIda()).get();
        Acheteur updatedAcheteur = acheteurMapper.grpcAcheteur2Acheteur(request.getAcheteurRequest());
        if (updatedAcheteur.getNom() != "") acheteur.setNom(updatedAcheteur.getNom());
        if (updatedAcheteur.getVille() != "") acheteur.setVille(updatedAcheteur.getVille());
        Acheteur savedAcheteur = acheteurRepository.save(acheteur);
        AcheteurOuterClass.UpdateAcheteurResponse response = AcheteurOuterClass.UpdateAcheteurResponse
                .newBuilder()
                .setAcheteur(acheteurMapper.acheteur2grpcAcheteur(savedAcheteur))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteAcheteur(AcheteurOuterClass.DeleteAcheteurRequest request, StreamObserver<AcheteurOuterClass.DeleteAcheteurResponse> responseObserver) {
        Acheteur acheteur = acheteurRepository.findById(request.getIda()).get();
        acheteurRepository.deleteById(request.getIda());
        AcheteurOuterClass.DeleteAcheteurResponse response = AcheteurOuterClass.DeleteAcheteurResponse
                .newBuilder()
                .setMessage("Acheteur (" + acheteur.getIda() + "," + acheteur.getNom() + "," + acheteur.getVille() + ") supprimé avec succès")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
