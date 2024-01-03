package com.mba.venteservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Acheteur {
    private Integer ida;
    private String nom;
    private String ville;

}
