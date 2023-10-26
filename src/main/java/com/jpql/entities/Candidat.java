package com.jpql.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Candidat extends AuditModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotBlank
	@Column(nullable = false)
	private String nom,prenom;
	@Min(value = 18)
	private int age;
	@Column(unique = true,nullable = false)
	@Email
	private String email;
	
	private String adresse,telephone;
	@ManyToMany(fetch = FetchType.EAGER)
	@JsonManagedReference
	private Set<Formation> formations=new HashSet<Formation>();

}
