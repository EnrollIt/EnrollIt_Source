package com.enrollIt.services;

import com.enrollIt.dao.SchoolDao;
import com.enrollIt.models.School;

public class AddSchoolService {

	public AddSchoolService(School school) {
		SchoolDao schoolDao = new SchoolDao();
		schoolDao.addSchool(school);
	}

}
