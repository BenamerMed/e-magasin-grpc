package com.mba.venteservice.entities;

import com.mba.venteservice.models.Acheteur;
import com.mba.venteservice.models.Produit;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Vente {

    //idv,ida,idp,quantite,mois,annee,acheteur,produit

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idv;
    private Integer ida;
    private Integer idp;
    private Integer quantite;
    private Integer mois;
    private Integer annee;
    @Transient
    private Produit produit;
    @Transient
    private Acheteur acheteur;

}
/* 3 micro-service
 * achteur :ida,nom,ville
 * produit :idp,marque,desc,prix,quantite
 * vente,idv,ida,idp,quantite,mois,annee,acheteur,produit
 *
 * 			achteur-service acheteur-db
 *
 * 			discouvery-service
 * 			gatway-service
 *
 *
 *
 * eurieka clien sb actua
 * config client
 *
 * */