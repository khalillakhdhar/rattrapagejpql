package com.jpql.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpql.entities.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat, Long> {
List<Candidat> findByNomAndPrenom(String nom,String prenom);
}
