package com.ashokit.enitity;

import java.time.LocalDate;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionIdJavaType;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "CITIZEN_APP")
@Data
public class CitizenappEntity {
	@Id
	@GeneratedValue
	private Integer citizenAppid;
	private String fullName;
	private String email;
	private Double phno;
	private String gender;
	private LocalDate dob;
	private Double ssn;
	private String state;
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(insertable = false)
	@CreationTimestamp
	private LocalDate updatedDate;

}
