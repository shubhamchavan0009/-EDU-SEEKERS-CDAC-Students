package com.es.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Course {
	
	@Id
	private long id;
	private String title;
	private String description;
	@Lob
	@Column(columnDefinition="MEDIUMBLOB")
	private String immage;
	
	public Course(long id, String title, String description,String immage) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.immage = immage;
	}

	public Course() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getImmage() {
		return immage;
	}

	public void setImmage(String immage) {
		this.immage = immage;
	}
	
	

}
