package com.amazonaws.lambda.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "EmployeeData")
public class Employee {

	
	private String Emp_id;
	private String Emp_name;
	private String designation;
	private String Email;

	@DynamoDBHashKey(attributeName = "Emp_id")
	public String getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(String emp_id) {
		Emp_id = emp_id;
	}

	@DynamoDBAttribute(attributeName = "Emp_name")
	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	@DynamoDBAttribute(attributeName = "designation")
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@DynamoDBAttribute(attributeName = "Email_id")
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", Emp_name=" + Emp_name + ", designation=" + designation + ", Email="
				+ Email + "]";
	}

}
