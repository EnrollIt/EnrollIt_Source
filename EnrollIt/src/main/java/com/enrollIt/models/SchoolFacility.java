package com.enrollIt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SchoolFacility{	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique=true,nullable=false)
	private String facilityName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public SchoolFacility(String facilityName) {
		super();
		this.facilityName = facilityName;
	}
	
	public  SchoolFacility() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		return this.facilityName.equals(((SchoolFacility)obj).getFacilityName());
		
	}

	@Override
	public int hashCode() {
		
		return this.getFacilityName().hashCode();
	}
	
	
	
	
	

}
