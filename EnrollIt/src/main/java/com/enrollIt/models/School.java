package com.enrollIt.models;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;




@Entity
public class School {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	String schoolName;
	int fees;
	float rating;
	String imagePath;
	String review;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	Address address;
	
	//@OneToMany(fetch= FetchType.EAGER,cascade = CascadeType.ALL,mappedBy="facilityName")
	@ManyToMany(fetch= FetchType.EAGER,cascade = CascadeType.REMOVE)
	List<SchoolFacility> facilities;
	@ManyToMany(fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	List<Language> languagesAvailable;
	
	@ManyToMany(fetch= FetchType.EAGER,cascade = CascadeType.ALL)
	List<Standard> standardsAvailable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Language> getLanguagesAvailable() {
		return languagesAvailable;
	}

	public void setLanguagesAvailable(List<Language> languagesAvailable) {
		this.languagesAvailable = languagesAvailable;
	}

	public List<SchoolFacility> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<SchoolFacility> facilities) {
		this.facilities = facilities;
	}

	public List<Standard> getStandardsAvailable() {
		return standardsAvailable;
	}

	public void setStandardsAvailable(List<Standard> standardsAvailable) {
		this.standardsAvailable = standardsAvailable;
	}
	
	
}