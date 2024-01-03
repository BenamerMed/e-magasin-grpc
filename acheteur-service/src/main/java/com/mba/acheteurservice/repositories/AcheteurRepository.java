package com.mba.acheteurservice.repositories;

import com.mba.acheteurservice.entities.Acheteur;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestController
public interface AcheteurRepository extends JpaRepository<Acheteur, Long> {
}
