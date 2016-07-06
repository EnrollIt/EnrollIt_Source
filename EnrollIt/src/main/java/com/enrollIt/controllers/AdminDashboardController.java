package com.enrollIt.controllers;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enrollIt.models.School;
import com.enrollIt.models.SchoolFacility;
import com.enrollIt.services.SchoolFacilityManager;

@Controller
public class AdminDashboardController {
	
	@RequestMapping(value="/adminDashboard")
	public String showDashboard(Model model ) {
		School school = new School();
		SchoolFacilityManager sfManager = new SchoolFacilityManager();
		school.setFacilities(new ArrayList(sfManager.getAllFacilites()));
		model.addAttribute("school", school);
		//model.addAttribute("facilitySet", (HashSet<SchoolFacility>)school.getFacilities());
		return "adminDashboard";
	}
	

}
