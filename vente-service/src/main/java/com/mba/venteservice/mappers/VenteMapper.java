package com.mba.venteservice.mappers;

import com.mba.venteservice.entities.Vente;
import com.mba.venteservice.stubs.VenteOuterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VenteMapper {
    @Autowired
    private AcheteurMapper acheteurMapper;
    @Autowired
    private ProduitMapper produitMapper;

    public VenteOuterClass.VenteResponse vente2grpcVente(Vente vente) {
        return VenteOuterClass.VenteResponse.newBuilder()
                .setIdv(vente.getIdv())
                .setIdp(vente.getIdp())
                .setIda(vente.getIda())
                .setQuantite(vente.getQuantite())
                //.setAcheteur(acheteurMapper.acheteur2grpcAcheteur(vente.getAcheteur()))
                //.setProduit(produitMapper.produit2grpcProduit(vente.getProduit()))
                .setMois(vente.getMois())
                .setAnnee(vente.getAnnee())
                .build();
    }

    public Vente grpcVente2Vente(VenteOuterClass.VenteRequest grpcVente) {
        return Vente.builder()
                .ida((int) grpcVente.getIda())
                .idp((int) grpcVente.getIdp())
                .quantite(grpcVente.getQuantite())
                .mois(grpcVente.getMois())
                .annee(grpcVente.getAnnee())
                .build();
    }

}
