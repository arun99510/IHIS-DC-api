package com.ashokit.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.Childbinding;
import com.ashokit.binding.CitienPlansBinding;
import com.ashokit.binding.EducationBinding;
import com.ashokit.binding.IncomeBinding;
import com.ashokit.binding.Summary;
import com.ashokit.service.DCService;

@RestController
public class DCrestController {

	@Autowired
	private DCService dcservice;
	@GetMapping("/getplans")
	public ResponseEntity<Map<Integer,String>> getPlans()
	{
		Map<Integer, String> plans = dcservice.getPlans();
		return new ResponseEntity<>(plans,HttpStatus.OK);
	}
	@PostMapping("/saveplans")
	private ResponseEntity<String> savePlans(CitienPlansBinding binding)
	{
		String savePlan = dcservice.savePlan(binding);
		return new ResponseEntity<>(savePlan,HttpStatus.OK);
	}
	@PostMapping("/saveincome")
	private ResponseEntity<String> saveIncome( @RequestBody IncomeBinding binding)
	{
		String saveIncome = dcservice.saveIncome(binding);
		return new ResponseEntity<>(saveIncome,HttpStatus.OK);
	}
	@PostMapping("/saveeducation")
	private ResponseEntity<String> saveEducation(@RequestBody EducationBinding binding)
	{
		String saveEducation = dcservice.saveEducation(binding);
		return new ResponseEntity<>(saveEducation,HttpStatus.OK);
	}
	@PostMapping
	private ResponseEntity<String> saveChild(@RequestBody Childbinding childbinding)
	{
		String saveChild = dcservice.saveChild(childbinding);
		return new ResponseEntity<>(saveChild,HttpStatus.OK);
	}
	@GetMapping("/summary/{citizenAppid}")
	private ResponseEntity<Summary> summary(@PathVariable Integer citizenAppid )
	{
		Summary summary = dcservice.summary(citizenAppid);
		return new ResponseEntity<>(summary,HttpStatus.OK);
	}
}
