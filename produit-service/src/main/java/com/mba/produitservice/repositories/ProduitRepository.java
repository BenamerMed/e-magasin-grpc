package com.mba.produitservice.repositories;

import com.mba.produitservice.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestController
public interface ProduitRepository extends JpaRepository<Produit, Long> {


}
