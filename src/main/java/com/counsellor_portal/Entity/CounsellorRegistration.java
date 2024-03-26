package com.counsellor_portal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Counsellorreg")
public class CounsellorRegistration {

	private String name;
	@Id
	private String email;
	private String password;
	private Long phoneno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public CounsellorRegistration(String name, String email, String password, Long phoneno) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
	}
	public  CounsellorRegistration() {
	}
 
}
