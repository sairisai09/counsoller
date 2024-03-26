package com.counsellor_portal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="addEnquiry")
public class AddEnquiry {
	@Id
private String Studentname;
private Long phoneno;
private String classMode;
private String course;
private String Status;
@ManyToOne
@JoinColumn(name="name")
private CounsellorRegistration name;

public CounsellorRegistration getName() {
	return name;
}
public void setName(CounsellorRegistration name) {
	this.name = name;
}

public String getStudentname() {
	return Studentname;
}
public void setStudentname(String studentname) {
	Studentname = studentname;
}
public Long getPhoneno() {
	return phoneno;
}
public void setPhoneno(Long phoneno) {
	this.phoneno = phoneno;
}
public String getClassMode() {
	return classMode;
}
public void setClassMode(String classMode) {
	this.classMode = classMode;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public AddEnquiry(String studentname, Long phoneno, String classMode, String course, String status) {
	super();
	Studentname = studentname;
	this.phoneno = phoneno;
	this.classMode = classMode;
	this.course = course;
	Status = status;
}

}
