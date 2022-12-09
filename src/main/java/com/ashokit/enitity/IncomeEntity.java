package com.ashokit.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "INCOME_ENTITY")
public class IncomeEntity {
	@Id
	@GeneratedValue
	private Integer incomeID;

	private Double monthlyIncome;
	private Double rentIncome;
	private Double propertyIncome;
	private Integer citizenAppid;
}
