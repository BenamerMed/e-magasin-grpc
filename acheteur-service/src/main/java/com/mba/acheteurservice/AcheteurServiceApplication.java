package com.mba.acheteurservice;

import com.mba.acheteurservice.config.GlobalConfig;
import com.mba.acheteurservice.entities.Acheteur;
import com.mba.acheteurservice.repositories.AcheteurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

@EnableConfigurationProperties({GlobalConfig.class})
public class AcheteurServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcheteurServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AcheteurRepository acheteurRepository) {
        return args -> {
            Acheteur a1 = Acheteur.builder()
                    .nom("Mohammed")
                    .ville("Fes")
                    .build();
            acheteurRepository.save(a1);

            Acheteur a2 = Acheteur.builder()
                    .nom("Ahmed")
                    .ville("Fes")
                    .build();
            acheteurRepository.save(a2);

            Acheteur a3 = Acheteur.builder()
                    .nom("Ali")
                    .ville("Casa")
                    .build();
            acheteurRepository.save(a3);

            Acheteur a4 = Acheteur.builder()
                    .nom("Badr")
                    .ville("Martil")
                    .build();
            acheteurRepository.save(a4);

            Acheteur a5 = Acheteur.builder()
                    .nom("Aymane")
                    .ville("Agadir")
                    .build();
            acheteurRepository.save(a5);

            Acheteur a6 = Acheteur.builder()
                    .nom("Mohamed")
                    .ville("Rabat")
                    .build();
            acheteurRepository.save(a6);

            Acheteur a7 = Acheteur.builder()
                    .nom("Salma")
                    .ville("Fes")
                    .build();
            acheteurRepository.save(a7);

            Acheteur a8 = Acheteur.builder()
                    .nom("Ghita")
                    .ville("Meknes")
                    .build();
            acheteurRepository.save(a8);

            Acheteur a9 = Acheteur.builder()
                    .nom("Walid")
                    .ville("Fes")
                    .build();
            acheteurRepository.save(a9);

            Acheteur a10 = Acheteur.builder()
                    .nom("Karima")
                    .ville("Fes")
                    .build();
            acheteurRepository.save(a10);

        };
    }

}
