package com.mba.venteservice;

import com.mba.venteservice.entities.Vente;
import com.mba.venteservice.repositories.VenteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VenteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(VenteRepository venteRepository) {
        return args -> {
            /*
            Vente v= Vente.builder()
                    .quantite()
                    .mois()
                    .annee()
                    .ida()
                    .idp()
                    .build();
            venteRepository.save(v);
            */

            Vente v1 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(1)
                    .idp(2)
                    .build();
            venteRepository.save(v1);
            //------------------
            Vente v2 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(1)
                    .idp(3)
                    .build();
            venteRepository.save(v2);
            //------------------
            Vente v3 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(2)
                    .idp(4)
                    .build();
            venteRepository.save(v3);
            //------------------
            Vente v4 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(3)
                    .idp(4)
                    .build();
            venteRepository.save(v4);
            //------------------
            Vente v5 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(1)
                    .idp(1)
                    .build();
            venteRepository.save(v5);
            //-----------------5
            Vente v6 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(1)
                    .idp(1)
                    .build();
            venteRepository.save(v6);
            //------------------
            Vente v7 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(5)
                    .idp(6)
                    .build();
            venteRepository.save(v7);
            //------------------
            Vente v8 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(6)
                    .idp(7)
                    .build();
            venteRepository.save(v8);
            //------------------
            Vente v9 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(7)
                    .idp(5)
                    .build();
            venteRepository.save(v9);
            //------------------
            Vente v10 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(8)
                    .idp(1)
                    .build();
            venteRepository.save(v10);
            //------------------
            Vente v11 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(9)
                    .idp(1)
                    .build();
            venteRepository.save(v11);
            //------------------
            Vente v12 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(4)
                    .idp(1)
                    .build();
            venteRepository.save(v12);
            //------------------
            Vente v13 = Vente.builder()
                    .quantite(5)
                    .mois(1)
                    .annee(2023)
                    .ida(9)
                    .idp(1)
                    .build();
            venteRepository.save(v13);
            //------------------



        };


    }
}
