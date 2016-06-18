package com.enrollIt.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.ogm.cfg.OgmConfiguration;
import org.hibernate.service.ServiceRegistry;

import com.enrollIt.models.Address;
import com.enrollIt.models.School;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new OgmConfiguration();
			configuration.configure();
			configuration.addAnnotatedClass(School.class);
			configuration.addAnnotatedClass(Address.class);
			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();

		    // If you miss the below line then it will complaing about a missing dialect setting
		    serviceRegistryBuilder.applySettings(configuration.getProperties());
		    ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		    
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}