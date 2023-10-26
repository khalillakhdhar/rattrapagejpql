package com.jpql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpql.entities.Candidat;
import com.jpql.repositories.CandidatRepository;
@Service
public class CandidatServiceimpl implements CandidatService {
	@Autowired // injection des dépendence
	CandidatRepository candidatRepository;
	

	@Override
	@Transactional
	public List<Candidat> getAllCandidats() {
		// TODO Auto-generated method stub
		return candidatRepository.findAll();
	}

	@Override
	public Candidat getOneCandidat(long id) {
		// TODO Auto-generated method stub
		return candidatRepository.findById(id).orElse(null);
	}

	@Override
	public Candidat saveOneCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		return candidatRepository.save(candidat);
	}

	@Override
	public void deleteOneCandidat(long id) {
		// TODO Auto-generated method stub
		candidatRepository.deleteById(id);

	}

}
