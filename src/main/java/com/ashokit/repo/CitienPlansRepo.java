package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.enitity.CitienPlansEntity;

public interface CitienPlansRepo extends JpaRepository<CitienPlansEntity, Integer> {


	CitienPlansEntity findByCitizenAppid(Integer  citizenAppid);


	
}
