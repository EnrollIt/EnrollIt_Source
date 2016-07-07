package com.enrollIt.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Component;

import com.enrollIt.models.Address;
import com.enrollIt.models.School;

/*
 * Required for OGM only as session factory for orm is done via
 * spring injection-autowired. 
 */
public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	static {
		try {
		//This is for OGM
			//Configuration configuration = new OgmConfiguration();
			Configuration configuration = new Configuration();
			configuration.configure();
		    sessionFactory = configuration.buildSessionFactory();
		    
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}