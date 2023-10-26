package com.jpql.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public  class AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
}
