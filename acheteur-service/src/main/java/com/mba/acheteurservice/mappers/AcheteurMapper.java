package com.mba.acheteurservice.mappers;

import com.mba.acheteurservice.entities.Acheteur;
import com.mba.acheteurservice.stubs.AcheteurOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AcheteurMapper {
    private ModelMapper modelMapper;

    public AcheteurOuterClass.Acheteur acheteur2grpcAcheteur(Acheteur acheteur) {
        //return modelMapper.map(acheteur, AcheteurOuterClass.Acheteur.Builder.class).build();
        return AcheteurOuterClass.Acheteur.newBuilder()
                .setIda(acheteur.getIda())
                .setNom(acheteur.getNom())
                .setVille(acheteur.getVille())
                .build();
    }

    public Acheteur grpcAcheteur2Acheteur(AcheteurOuterClass.AcheteurRequest grpcAcheteur) {
        //return modelMapper.map(grpcAcheteur,Acheteur.class);
        return Acheteur.builder()
                .nom(grpcAcheteur.getNom())
                .ville(grpcAcheteur.getVille())
                .build();
    }
}
