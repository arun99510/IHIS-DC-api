package com.ashokit.service;

import java.util.Map;

import com.ashokit.binding.Childbinding;
import com.ashokit.binding.CitienPlansBinding;
import com.ashokit.binding.EducationBinding;
import com.ashokit.binding.IncomeBinding;
import com.ashokit.binding.Summary;
import com.ashokit.enitity.EducationEntity;

public interface DCService {
 
	Map<Integer,String> getPlans();
	
	public String savePlan(CitienPlansBinding plansbinding);
	
	public String saveIncome(IncomeBinding incomebinding);
	
	public String saveEducation(EducationBinding binding);
	
	public String saveChild(Childbinding Childbinding);
	
	public Summary summary(Integer citizenAppid);
}
