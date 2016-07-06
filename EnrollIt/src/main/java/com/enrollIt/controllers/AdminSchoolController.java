package com.enrollIt.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.enrollIt.models.Address;
import com.enrollIt.models.School;
import com.enrollIt.models.SchoolFacility;
import com.enrollIt.services.SchoolManager;



@Controller
@RequestMapping(value ="/admin")
public class AdminSchoolController {
	
	@Autowired
	SchoolManager schoolManager;
	
	@RequestMapping(value ="/addSchool")
	public @ResponseBody String addSchool(@RequestBody School school){//("schoolName") String schoolName,@RequestParam("state") String state,@RequestParam("fees") int fees,@RequestParam("pincode") int pincode,@RequestParam("facilities") Set<SchoolFacility> facilities ) {
		/*System.out.println("fsfds"+schoolName);
		School school = new School();
		school.setSchoolName(schoolName);
		Address address =new Address();
		address.setPincode(pincode);
		address.setState(state);
		school.setAddress(address);
		school.setFees(fees);
		school.setFacilities(facilities);*/
		schoolManager.addSchool(school);
		
		return "Done..! \n Good Job.!";
	}
}
