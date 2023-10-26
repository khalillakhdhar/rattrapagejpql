package com.jpql.service;

import java.util.List;

import com.jpql.entities.Candidat;

public interface CandidatService {
public List<Candidat> getAllCandidats();
public Candidat getOneCandidat(long id);
public Candidat saveOneCandidat(Candidat candidat);
public void deleteOneCandidat(long id);
}
