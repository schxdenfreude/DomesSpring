package com.example.domes.repository;

import com.example.domes.beans.LigneDeCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneDeCommandeRepository extends JpaRepository<LigneDeCommande, Long> {

}