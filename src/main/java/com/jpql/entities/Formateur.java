package com.jpql.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Formateur extends AuditModel implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name = "nom_complet",nullable = false)
private String nomComplet;

private String propos;
@Column(nullable = false)
private String specialite;
}
