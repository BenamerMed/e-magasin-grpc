package com.mba.venteservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produit {

    private Integer idp;
    private String marque;
    private String desc;
    private Double prix;
    private Integer quantite;

}