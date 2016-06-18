package com.enrollIt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.ogm.cfg.OgmConfiguration;
import org.hibernate.service.ServiceRegistry;







import com.enrollIt.models.Address;
import com.enrollIt.models.School;
import com.enrollIt.util.HibernateUtil;

public class SchoolDao {
	
	public void addSchool(School school){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();   	
	    
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save( school );
		session.getTransaction().commit();
		session.close();
		
	}

}
