package com.jpql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpql.entities.Formation;
import com.jpql.repositories.FormationRepository;

@Service
public class FormationServiceImplement {
	@Autowired // injection des dépendence
	FormationRepository formationRepository;
	

	@Transactional
	public List<Formation> getAllFormations() {
		// TODO Auto-generated method stub
		return formationRepository.findAll();
	}

	
	public Formation getOneFormation(long id) {
		// TODO Auto-generated method stub
		return formationRepository.findById(id).orElse(null);
	}

	
	public Formation saveOneFormation(Formation formation) {
		// TODO Auto-generated method stub
		return formationRepository.save(formation);
	}

	
	public void deleteOneFormation(long id) {
		// TODO Auto-generated method stub
		formationRepository.deleteById(id);

	}
	
	
	
}
