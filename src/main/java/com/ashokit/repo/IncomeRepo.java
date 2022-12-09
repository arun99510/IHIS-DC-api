package com.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.enitity.IncomeEntity;

public interface IncomeRepo extends JpaRepository<IncomeEntity, Integer> {
	
	IncomeEntity findByCitizenAppid (Integer citizenAppid);
	
}
