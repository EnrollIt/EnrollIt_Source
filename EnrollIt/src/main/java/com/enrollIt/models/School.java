package com.enrollIt.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
	@Id
	String id;
	String schoolName;
	Address address;
	int fees;
	float rating;
	SchoolFacilities facilities;
	AdmissionDetails admissionDetails;
	LanguageAvailable languageAvailable;
	String imagePath;
	String review;
	StandardsAvailable standards;
	
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
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public SchoolFacilities getFacilities() {
		return facilities;
	}
	public void setFacilities(SchoolFacilities facilities) {
		this.facilities = facilities;
	}
	public AdmissionDetails getAdmissionDetails() {
		return admissionDetails;
	}
	public void setAdmissionDetails(AdmissionDetails admissionDetails) {
		this.admissionDetails = admissionDetails;
	}
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
	public StandardsAvailable getStandards() {
		return standards;
	}
	public void setStandards(StandardsAvailable standards) {
		this.standards = standards;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	

}
