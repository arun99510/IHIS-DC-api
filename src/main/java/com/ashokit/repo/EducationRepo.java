package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.enitity.EducationEntity;

public interface EducationRepo extends JpaRepository<EducationEntity, Integer> {

	EducationEntity findByCitizenAppid(Integer citizenid);
}
