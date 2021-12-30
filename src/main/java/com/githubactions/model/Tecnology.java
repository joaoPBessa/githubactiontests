package com.githubactions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TECNOLOGY")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@SequenceGenerator(name = Tecnology.TECNOLOGY_GENERATOR, allocationSize = 1, initialValue = 1, sequenceName = "TECNOLOGY_ID")
public class Tecnology {
	
	protected static final String TECNOLOGY_GENERATOR = "TECNOLOGY_GENERATOR"; 
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = TECNOLOGY_GENERATOR)
	private Integer id;
	
	@Column(name = "DESCRIPTION")
	private String description;

}
