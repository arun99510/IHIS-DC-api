package com.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.enitity.ChildEntity;

public interface ChildRepo extends JpaRepository<ChildEntity, Integer> {

	ChildEntity findByCitizenAppid (Integer citizenAppid);

	
}
