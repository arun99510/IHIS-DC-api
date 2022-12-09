package com.ashokit.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "CITIZEN_PLANS")
public class CitienPlansEntity {

	@Id
	@GeneratedValue
	private Integer citizenPlanid;
	private String planName;
	private Integer citizenAppid;
	
	
}
