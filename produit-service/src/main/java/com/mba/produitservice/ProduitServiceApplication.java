package com.mba.produitservice;

import com.mba.produitservice.config.GlobalConfig;
import com.mba.produitservice.entities.Produit;
import com.mba.produitservice.repositories.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({GlobalConfig.class})
public class ProduitServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduitServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProduitRepository produitRepository) {
        return args -> {
            for (int i = 1; i <= 20; i++) {
                Produit p = Produit.builder()
                        .marque("Marque " + i)
                        .desc("Description " + i)
                        .prix(i * 20000.)
                        .quantite(i * 10)
                        .build();
                produitRepository.save(p);
            }
            /*
            Produit p1 = Produit.builder()
                    .marque("BMW M135i")
                    .desc("2.0 : puissance de 306 ch")
                    .prix(713000.)
                    .quantite(5)
                    .build();
            produitRepository.save(p1);
            //----------------------------
            Produit p2 = Produit.builder()
                    .marque("BMW M2 Competetion")
                    .desc("3.0 : puissance de 410 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p2);
//----------------------------
            Produit p3 = Produit.builder()
                    .marque("BMW M3 Competetion")
                    .desc("3.0 : puissance de 550 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p3);
//----------------------------
            Produit p4 = Produit.builder()
                    .marque("BMW M4 Competetion")
                    .desc("3.0 : puissance de 585 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p4);
//----------------------------
            Produit p5 = Produit.builder()
                    .marque("BMW M5 CS")
                    .desc("4.4 : puissance de 635 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p5);
//----------------------------
            Produit p6 = Produit.builder()
                    .marque("BMW M8 Competetion")
                    .desc("4.4 : puissance de 625 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p6);
//----------------------------
            Produit p7 = Produit.builder()
                    .marque("Audi RS3")
                    .desc("2.5 : puissance de 380 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p7);
//----------------------------
            Produit p8 = Produit.builder()
                    .marque("Audi RS4")
                    .desc("2.9 : puissance de 410 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p8);
//----------------------------
            Produit p9 = Produit.builder()
                    .marque("Audi RS5")
                    .desc("3.0 : puissance de 306 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p9);
//----------------------------
            Produit p10 = Produit.builder()
                    .marque("Audi RS6")
                    .desc("3.0 : puissance de 306 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p10);
//----------------------------
            Produit p11 = Produit.builder()
                    .marque("AMG A45")
                    .desc("3.0 : puissance de 306 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p11);
//----------------------------
            Produit p12 = Produit.builder()
                    .marque("AMG C63s")
                    .desc("3.0 : puissance de 306 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p12);
//----------------------------
            Produit p13 = Produit.builder()
                    .marque("AMG E63s")
                    .desc("3.0 : puissance de 306 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p13);
            //----------------------------
            Produit p14 = Produit.builder()
                    .marque("Audi RS7")
                    .desc("3.0 : puissance de 306 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p14);
//----------------------------
            Produit p15 = Produit.builder()
                    .marque("AMG G63")
                    .desc("3.0 : puissance de 306 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p15);
//----------------------------
            Produit p16 = Produit.builder()
                    .marque("AMG S63")
                    .desc("3.0 : puissance de 306 ch")
                    .prix(0.)
                    .quantite(5)
                    .build();
            produitRepository.save(p16);


             */
        };
    }
}
