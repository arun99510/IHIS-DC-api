package com.ashokit.enitity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EDUCATION")
public class EducationEntity {

	@Id
	@GeneratedValue
	@Column(name = "EducationId")
	private Integer educationId;
	private String heighestdegree;
	private Integer graduationYear;
	private String univercityName;
	private Integer citizenAppid;
}
