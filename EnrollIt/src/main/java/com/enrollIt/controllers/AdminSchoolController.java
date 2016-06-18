package com.enrollIt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.enrollIt.models.Address;
import com.enrollIt.models.School;
import com.enrollIt.services.AddSchoolService;


@Controller
@RequestMapping(value ="/admin")
public class AdminSchoolController {
	
	@RequestMapping(value ="/addSchool")
	public @ResponseBody String addSchool(@RequestParam("schoolName") String schoolName,@RequestParam("state") String state,@RequestParam("fees") int fees,@RequestParam("pincode") int pincode ) {
		System.out.println("fsfds"+schoolName);
		School school = new School();
		school.setSchoolName(schoolName);
		Address address =new Address();
		address.setPincode(pincode);
		address.setState(state);
		school.setAddress(address);
		school.setFees(fees);
		new AddSchoolService(school);
		
		return "Done..! \n Good Job.!";
	}
}
