package com.enrollIt.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.enrollIt.models.School;
import com.enrollIt.models.SchoolFacility;
import com.enrollIt.util.HibernateUtil;

@Repository
public class SchoolDaoImpl implements SchoolDao {
	
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	public void addSchool(School school){
   	
	    if (sessionFactory == null){
	    	System.out.println("sessionFactory is null, initializing it from HibernateUtil");
	    	sessionFactory = HibernateUtil.getSessionFactory();
	    }
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		
		List<Integer> sf = new ArrayList<Integer>() ;
		
		System.out.println( school.getFacilities() );
		
		for(SchoolFacility schoolFacility:school.getFacilities()){
			/*List listofschoolfaclitites = (session.createCriteria(SchoolFacility.class).add(Restrictions.eq("facilityName", schoolFacility.getFacilityName()))).list();
			if(listofschoolfaclitites.isEmpty()){
				//SchoolFacility sf = (SchoolFacility) listofschoolfaclitites.get(0);
				//schoolFacility.setId(sf.getId());
				session.saveOrUpdate(schoolFacility);
			}*/
			
			System.out.println(schoolFacility.getId() + " ------------ " + schoolFacility.getFacilityName() );
			sf.add(  Integer.parseInt( schoolFacility.getFacilityName() ) ) ;
		}
	
		System.out.println( "SF : " + sf );
	
		Criteria cr = session.createCriteria(SchoolFacility.class ).add(Restrictions.in("id", sf )) ;
		List<SchoolFacility> sflist = cr.list() ;
		
		System.out.println( "SFL : " + sflist );
		
		Set<SchoolFacility> sfset = new HashSet<SchoolFacility>() ;
		sfset.addAll(sflist)	;
		
		System.out.println( "Set : " + sfset );
		
		
		school.setFacilities( new ArrayList<SchoolFacility>(sfset) );
		
		session.save( school );
		session.getTransaction().commit();
		if(session.isOpen())
			session.close();
		
	}

}
