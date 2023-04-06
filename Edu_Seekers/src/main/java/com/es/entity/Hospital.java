package com.es.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	//@Column(name="Dr.Name")
	private String hName;
	//@Column(name="Address")
	private String hAddress;
	//@Column(name="Contact No")
	private String hContactNumber;
	//@Column(name="Speciality")
	private String hSpeciality;
	//@Column(name="Rating")
	private String hRating;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public String gethAddress() {
		return hAddress;
	}
	public void sethAddress(String hAddress) {
		this.hAddress = hAddress;
	}
	public String gethContactNumber() {
		return hContactNumber;
	}
	public void sethContactNumber(String hContactNumber) {
		this.hContactNumber = hContactNumber;
	}
	public String getSpeciality() {
		return hSpeciality;
	}
	public void setSpeciality(String hspeciality) {
		this.hSpeciality = hspeciality;
	}
	public String gethRating() {
		return hRating;
	}
	public void sethRating(String hRating) {
		this.hRating = hRating;
	}
	public Hospital(String hName, String hAddress, String hContactNumber, String hspeciality, String hRating) {
		super();
		this.hName = hName;
		this.hAddress = hAddress;
		this.hContactNumber = hContactNumber;
		this.hSpeciality = hspeciality;
		this.hRating = hRating;
	}
	
	public Hospital() {
		super();
	}
	
	
	
	

}
