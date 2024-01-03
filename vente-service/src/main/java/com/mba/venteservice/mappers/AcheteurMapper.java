package com.mba.venteservice.mappers;


import com.mba.acheteurservice.stubs.AcheteurOuterClass;
import com.mba.venteservice.models.Acheteur;
import org.springframework.stereotype.Component;

@Component
public class AcheteurMapper {
    public AcheteurOuterClass.Acheteur acheteur2grpcAcheteur(Acheteur acheteur) {
        return AcheteurOuterClass.Acheteur.newBuilder()
                .setIda(acheteur.getIda())
                .setNom(acheteur.getNom())
                .setVille(acheteur.getVille())
                .build();
    }

    public Acheteur grpcAcheteur2Acheteur(AcheteurOuterClass.Acheteur grpcAcheteur) {
        return Acheteur.builder()
                .ida((int) grpcAcheteur.getIda())
                .nom(grpcAcheteur.getNom())
                .ville(grpcAcheteur.getVille())
                .build();
    }
}
