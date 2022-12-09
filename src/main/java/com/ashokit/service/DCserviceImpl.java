package com.ashokit.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.ashokit.binding.Childbinding;
import com.ashokit.binding.CitienPlansBinding;
import com.ashokit.binding.EducationBinding;
import com.ashokit.binding.IncomeBinding;
import com.ashokit.binding.Summary;
import com.ashokit.enitity.AdminPlansEntity;
import com.ashokit.enitity.ChildEntity;
import com.ashokit.enitity.CitienPlansEntity;
import com.ashokit.enitity.EducationEntity;
import com.ashokit.enitity.IncomeEntity;
import com.ashokit.repo.AdminPlansRepo;
import com.ashokit.repo.ChildRepo;
import com.ashokit.repo.CitienPlansRepo;
import com.ashokit.repo.EducationRepo;
import com.ashokit.repo.IncomeRepo;

@Service
public class DCserviceImpl implements DCService {

	@Autowired
	private AdminPlansRepo adminRepo;
	@Autowired
	private CitienPlansRepo citienPlansRepo;
	@Autowired
	private IncomeRepo incomeRepo;
@Autowired
	private EducationRepo educationRepo;
@Autowired
private ChildRepo childRepo;
	@Override
	public Map<Integer, String> getPlans() {
		List<AdminPlansEntity> allPlans = adminRepo.findAll();

		Map<Integer, String> planMap = new HashMap<>();

		allPlans.forEach(plans -> {
			planMap.put(plans.getPlanId(), plans.getPlanName());
		});
		return planMap;
	}

	@Override
	public String savePlan(CitienPlansBinding binding) {
		CitienPlansEntity entity=new  CitienPlansEntity();
		BeanUtils.copyProperties(binding, entity);
		citienPlansRepo.save(entity);	
		return "citienPlans saved";
	}

	@Override
	public String saveIncome(IncomeBinding binding) {

		IncomeEntity entity=new IncomeEntity();
		BeanUtils.copyProperties(binding, entity);
		incomeRepo.save(entity);
		return "Citizen Income saved";
	}

	@Override
	public String saveEducation(EducationBinding binding) {
		EducationEntity entity=new EducationEntity();
		BeanUtils.copyProperties(binding, entity);
		educationRepo.save(entity);
		return "education Data Saved";
	}

	@Override
	public String saveChild(Childbinding Childbinding) {

		ChildEntity childEntity=new ChildEntity();
		BeanUtils.copyProperties(Childbinding, childEntity);
	childRepo.save(childEntity);
		return "Child data saved";
	}

	@Override
	public Summary summary(Integer citizenAppid) {

		Summary summary=new Summary();
		EducationEntity educationEntity = educationRepo.findByCitizenAppid(citizenAppid);
		EducationBinding educationBinding=new EducationBinding();
		BeanUtils.copyProperties(educationEntity, educationBinding);
		summary.setEducationBinding(educationBinding);
	
		IncomeEntity incomeEntity = incomeRepo.findByCitizenAppid(citizenAppid);
		IncomeBinding  incomeBinding=new IncomeBinding();
		BeanUtils.copyProperties(incomeEntity, incomeBinding);
		summary.setIncomeBinding(incomeBinding);
		
	
		
		CitienPlansEntity citienPlansEntity = citienPlansRepo.findByCitizenAppid(citizenAppid);
		CitienPlansBinding citienPlansBinding=new CitienPlansBinding();
		BeanUtils.copyProperties(citienPlansEntity, citienPlansBinding);
		summary.setPlansBinding(citienPlansBinding);
		
		ChildEntity childEntity = childRepo.findByCitizenAppid(citizenAppid);
		Childbinding childbinding=new Childbinding();
		BeanUtils.copyProperties(childEntity, childbinding);
		summary.setChildbinding(childbinding);
		
		return summary;
	}

}
