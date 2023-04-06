package com.es.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="accommodation")
public class Accommodation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String aName;
	private String aOwner;
	private String aAddress;
	private String aContact;
	private String aRent;
	private String aRating;
	private String aType;
	private String otherFacilities;
	@Lob
	@Column(columnDefinition="MEDIUMBLOB")
	private String image;
	
	public Accommodation() {
		super();
	}

	public Accommodation(long id, String aName, String aOwner, String aAddress, String aContact, String aRent,
			String aRating, String aType, String otherFacilities) {
		super();
		this.id = id;
		this.aName = aName;
		this.aOwner = aOwner;
		this.aAddress = aAddress;
		this.aContact = aContact;
		this.aRent = aRent;
		this.aRating = aRating;
		this.aType = aType;
		this.otherFacilities = otherFacilities;
		
	}

	public Accommodation(String image) {
		super();
		this.image = image;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaOwner() {
		return aOwner;
	}

	public void setaOwner(String aOwner) {
		this.aOwner = aOwner;
	}

	public String getaAddress() {
		return aAddress;
	}

	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}

	public String getaContact() {
		return aContact;
	}

	public void setaContact(String aContact) {
		this.aContact = aContact;
	}

	public String getaRent() {
		return aRent;
	}

	public void setaRent(String aRent) {
		this.aRent = aRent;
	}

	public String getaRating() {
		return aRating;
	}

	public void setaRating(String aRating) {
		this.aRating = aRating;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}

	public String getotherFacilities() {
		return otherFacilities;
	}

	public void setotherFacilities(String otherFacilities) {
		this.otherFacilities = otherFacilities;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
