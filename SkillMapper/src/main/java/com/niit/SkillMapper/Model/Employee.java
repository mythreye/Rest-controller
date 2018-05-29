package com.niit.SkillMapper.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeTable")
public class Employee {

	@Id

	int employee_id;

	@Column(nullable = false)
	String employeeName;

	@Column(nullable = false)
	String email_id;

	@Column(nullable = false)
	String gender;

	@Column(nullable = false)
	long phno;

	@Column(nullable = false)
	String address;

	@Column(nullable = false)
	//@Temporal(TemporalType.DATE)
	String birth_date;

	@Column(nullable = false)
	//@Temporal(TemporalType.DATE)
	String joining_date;

	@Column(nullable = false)
	String Role;
	
	@Column
	String mypassword;

	public String getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getPassword() {
		return mypassword;
	}

	public void setPassword(String mypassword) {
		mypassword = mypassword;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employeeName;
	}

	public void setEmployee_name(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
