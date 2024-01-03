package com.mba.venteservice.repositories;

import com.mba.venteservice.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestController
public interface VenteRepository extends JpaRepository<Vente, Integer> {
}
