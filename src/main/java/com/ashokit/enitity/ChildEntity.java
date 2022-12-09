package com.ashokit.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="CHILD_ENTITY")
public class ChildEntity {
@Id
@GeneratedValue
	private Integer childid;
	private Integer kidAge;
	private String kidName;
	private Double kidsSsn;
	private Integer citizenAppid;
}
