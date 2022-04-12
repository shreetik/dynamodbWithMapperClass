package com.amazonaws.lambda.entities;

public class Request {

	private String action;
	private String region;
	private String empId;
	private String empName;
	private String designation;
	private String email;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "request [action=" + action + ",  empId=" + empId + ", empName="
				+ empName + ", designation=" + designation + ", email=" + email + "]";
	}

}
