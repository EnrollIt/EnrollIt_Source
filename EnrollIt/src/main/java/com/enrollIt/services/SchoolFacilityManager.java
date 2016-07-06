package com.enrollIt.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.enrollIt.dao.FacililtyDaoImpl;
import com.enrollIt.models.SchoolFacility;


@Service
public class SchoolFacilityManager {

		public Set<SchoolFacility>getAllFacilites(){
			return (new FacililtyDaoImpl()).getAllFacilities();
		}
}
