package com.enrollIt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.ogm.cfg.OgmConfiguration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



import com.enrollIt.models.School;

public class SchoolDao {
	
	public void addSchool(School school){
		
		
		Configuration configuration = new OgmConfiguration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings( configuration.getProperties() ).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory( serviceRegistry );
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save( school );
		session.getTransaction().commit();
		
		
		/*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EnrollItPu");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(school);
		entityManager.getTransaction().commit();
		entityManager.close();
		*/
	}

}
