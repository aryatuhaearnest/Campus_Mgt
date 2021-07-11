package com.example.earnest.SchMgt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL )
@Entity()
public class Student implements Serializable {
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Id
private String id;
private String fullname;
private Department department;
private Course course;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String id, String fullname, Department department, Course course) {
	super();
	this.id = id;
	this.fullname = fullname;
	this.department = department;
	this.course = course;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}




}
