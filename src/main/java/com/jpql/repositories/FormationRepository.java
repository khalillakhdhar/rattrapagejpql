package com.jpql.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpql.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
List<Formation> findByTitre(String titre);
List<Formation> findByDescriptionContaining(String description);
}
