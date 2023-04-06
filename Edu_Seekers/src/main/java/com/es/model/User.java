//package com.es.model;
//
//import java.util.Collection;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.Table;
//import jakarta.persistence.UniqueConstraint;
//
//
////making class(pojo) as a JPA Entity
//
//@Entity
//@Table(name="user", uniqueConstraints=@UniqueConstraint(columnNames = "email"))
//public class User {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY )
//	private long id;
//	
//	@Column(name="First_NAME")
//	private String fName;
//	
//	@Column(name="Last_NAME")
//	private String Lname;
//	
//	private String email;
//	
//	private String password;
//	
//	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)  // any changes made in parent will applicalble to child as well
//	@JoinTable(
//			name="users_role",
//			joinColumns=@JoinColumn(name="user_id",referencedColumnName = "id"),
//			inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"))
//	private Collection<Role> roles; 
//	
//	
//	public User(String fName, String lname, String email, String password, Collection<Role> roles) {
//		super();
//		this.fName = fName;
//		Lname = lname;
//		this.email = email;
//		this.password = password;
//		this.roles = roles;
//	}
//
//	public User() {
//		
//	}
//
//	public long getId() {
//		return id;
//	}
//
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//
//	public String getfName() {
//		return fName;
//	}
//
//
//	public void setfName(String fName) {
//		this.fName = fName;
//	}
//
//
//	public String getLname() {
//		return Lname;
//	}
//
//
//	public void setLname(String lname) {
//		Lname = lname;
//	}
//
//
//	public String getEmail() {
//		return email;
//	}
//
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//	public Collection<Role> getRoles() {
//		return roles;
//	}
//
//
//	public void setRoles(Collection<Role> roles) {
//		this.roles = roles;
//	}
//	
//	
//	
//}
