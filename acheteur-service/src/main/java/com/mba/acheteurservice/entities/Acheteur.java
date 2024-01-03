package com.mba.acheteurservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class Acheteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ida;
    private String nom;
    private String ville;
}
