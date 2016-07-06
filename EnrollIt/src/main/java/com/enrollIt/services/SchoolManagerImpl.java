package com.enrollIt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enrollIt.dao.SchoolDao;
import com.enrollIt.dao.SchoolDaoImpl;
import com.enrollIt.models.School;

@Service
public class SchoolManagerImpl implements SchoolManager {
	
	@Autowired
	SchoolDao schoolDao;
	
	public void addSchool(School school) {
		
		schoolDao.addSchool(school);
	}

}
