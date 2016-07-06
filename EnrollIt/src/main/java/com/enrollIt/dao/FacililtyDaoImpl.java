package com.enrollIt.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.enrollIt.models.SchoolFacility;
import com.enrollIt.util.HibernateUtil;

public class FacililtyDaoImpl implements FacilityDao {
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public Set<SchoolFacility> getAllFacilities() {
		 if (sessionFactory == null){
		    	System.out.println("sessionFactory is null, initializing it from HibernateUtil");
		    	sessionFactory = HibernateUtil.getSessionFactory();
		    }
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			Set<SchoolFacility> facilities = new HashSet<SchoolFacility>((session.createCriteria(SchoolFacility.class).list()));
			
			if(session.isOpen())
				session.close();
		
		return facilities;
	}

}
