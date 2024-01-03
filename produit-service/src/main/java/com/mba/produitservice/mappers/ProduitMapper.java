package com.mba.produitservice.mappers;

import com.mba.produitservice.entities.Produit;
import com.mba.produitservice.stubs.ProduitOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProduitMapper {
    private ModelMapper modelMapper;

    public ProduitOuterClass.Produit produit2grpcProduit(Produit produit) {
        return ProduitOuterClass.Produit.newBuilder()
                .setIdp(produit.getIdp())
                .setDesc(produit.getDesc())
                .setPrix(produit.getPrix())
                .setMarque(produit.getMarque())
                .setQuantite(produit.getQuantite())
                .build();
    }

    public Produit grpcProduit2Produit(ProduitOuterClass.ProduitRequest grpcProduit) {
        return Produit.builder()
                .quantite(grpcProduit.getQuantite())
                .prix(grpcProduit.getPrix())
                .marque(grpcProduit.getMarque())
                .desc(grpcProduit.getDesc())
                .build();
    }
}
