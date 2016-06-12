package com.enrollIt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminSchoolController {
	
	@RequestMapping("/addSchool")
	public void addSchool() {
		System.out.println("legend");
	}
}
