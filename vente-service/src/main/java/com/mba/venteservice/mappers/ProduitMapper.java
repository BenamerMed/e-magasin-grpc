package com.mba.venteservice.mappers;

import com.mba.produitservice.stubs.ProduitOuterClass;
import com.mba.venteservice.models.Produit;
import org.springframework.stereotype.Component;

@Component
public class ProduitMapper {
    public ProduitOuterClass.Produit produit2grpcProduit(Produit produit) {
        return ProduitOuterClass.Produit.newBuilder()
                .setIdp(produit.getIdp())
                .setDesc(produit.getDesc())
                .setPrix(produit.getPrix())
                .setMarque(produit.getMarque())
                .setQuantite(produit.getQuantite())
                .build();
    }

    public Produit grpcProduit2Produit(ProduitOuterClass.Produit grpcProduit) {
        return Produit.builder()
                .idp((int) grpcProduit.getIdp())
                .quantite(grpcProduit.getQuantite())
                .prix(grpcProduit.getPrix())
                .marque(grpcProduit.getMarque())
                .desc(grpcProduit.getDesc())
                .build();
    }
}
