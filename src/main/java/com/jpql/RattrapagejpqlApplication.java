package com.jpql;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpql.entities.Candidat;
import com.jpql.entities.Formateur;
import com.jpql.entities.Formation;
import com.jpql.service.CandidatServiceimpl;
import com.jpql.service.FormationServiceImplement;

@SpringBootApplication
public class RattrapagejpqlApplication implements CommandLineRunner {
	@Autowired
	FormationServiceImplement formationApi;
	@Autowired
	CandidatServiceimpl candidatApi;

	public static void main(String[] args) {
		SpringApplication.run(RattrapagejpqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Formation f1=new Formation("spring boot", "aucune", "url", 90, null, null);
		Formation formation1= formationApi.saveOneFormation(f1);
		Set<Formation> forms=new HashSet<Formation>();
		Set<Formation> formations=new HashSet<Formation>();
		forms.add(formation1);
		Candidat c1=new Candidat("test","teste", 30, "test@gmail.com","ok","20999333", forms);
		candidatApi.saveOneCandidat(c1);
		candidatApi.getAllCandidats().forEach(c->
		{
			c.getFormations().forEach(System.out::println);
		});
		//formationApi.getAllFormations().forEach(System.out::println);
		
	}

}
