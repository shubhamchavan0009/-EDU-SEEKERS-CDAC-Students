package com.es.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mess")
public class Mess {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String mName;
	private String mOwner;
	private String mAddress;
	private String mContact;
	private String mFees;
	private String mRating;
	private String mType;
	
	public Mess() {
		super();
	}

	public Mess(long id, String mName, String mOwner, String mAddress, String mContact, String mFees, String mRating,
			String mType) {
		super();
		this.id = id;
		this.mName = mName;
		this.mOwner = mOwner;
		this.mAddress = mAddress;
		this.mContact = mContact;
		this.mFees = mFees;
		this.mRating = mRating;
		this.mType = mType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmOwner() {
		return mOwner;
	}

	public void setmOwner(String mOwner) {
		this.mOwner = mOwner;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public String getmContact() {
		return mContact;
	}

	public void setmContact(String mContact) {
		this.mContact = mContact;
	}

	public String getmFees() {
		return mFees;
	}

	public void setmFees(String mFees) {
		this.mFees = mFees;
	}

	public String getmRating() {
		return mRating;
	}

	public void setmRating(String mRating) {
		this.mRating = mRating;
	}

	public String getmType() {
		return mType;
	}

	public void setmType(String mType) {
		this.mType = mType;
	}
	
	
	

}
