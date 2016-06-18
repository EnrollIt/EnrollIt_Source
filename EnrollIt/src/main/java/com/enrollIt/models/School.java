package com.enrollIt.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.bson.types.ObjectId;








@Entity
public class School {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId id;
	String schoolName;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	Address address;
	int fees;
	/*float rating;
	SchoolFacilities facilities;
	AdmissionDetails admissionDetails;
	LanguageAvailable languageAvailable;
	String imagePath;
	String review;
	StandardsAvailable standards;*/
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
/*	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	public SchoolFacilities getFacilities() {
		return facilities;
	}
	public void setFacilities(SchoolFacilities facilities) {
		this.facilities = facilities;
	}
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	public AdmissionDetails getAdmissionDetails() {
		return admissionDetails;
	}
	public void setAdmissionDetails(AdmissionDetails admissionDetails) {
		this.admissionDetails = admissionDetails;
	}
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	public LanguageAvailable getLanguageAvailable() {
		return languageAvailable;
	}
	public void setLanguageAvailable(LanguageAvailable languageAvailable) {
		this.languageAvailable = languageAvailable;
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
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	public StandardsAvailable getStandards() {
		return standards;
	}
	public void setStandards(StandardsAvailable standards) {
		this.standards = standards;
	}*/
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	

}
