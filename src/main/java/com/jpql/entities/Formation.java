package com.jpql.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Formation extends AuditModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(nullable = false)
	@NotBlank
private String titre;
	@NotBlank
	@Column(nullable = false)
private String description,lienProgramme;
	@Min(value=10)
private int duree;
	@ManyToOne(fetch = FetchType.LAZY,optional = true)
	private Formateur formateur;
	
	@ManyToMany(mappedBy = "formations",fetch = FetchType.EAGER,cascade = {
			CascadeType.MERGE,
			CascadeType.PERSIST
	})
	@JsonBackReference
	private Set<Candidat> candidats=new HashSet<Candidat>();

}
