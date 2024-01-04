package com.mba.acheteurservice.mappers;

import com.mba.acheteurservice.entities.Acheteur;
import com.mba.acheteurservice.stubs.AcheteurOuterClass;
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

    public Acheteur grpcAcheteur2Acheteur(AcheteurOuterClass.AcheteurRequest grpcAcheteur) {
        return Acheteur.builder()
                .nom(grpcAcheteur.getNom())
                .ville(grpcAcheteur.getVille())
                .build();
    }
}
