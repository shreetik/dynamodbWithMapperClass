package com.amazonaws.lambda.entities;

public class Response {

	private String statu;
	private String msg;
	private Class<Employee> emp;
	
	public Class<Employee> getEmp() {
		return emp;
	}
	public void setEmp(Class<Employee> emp) {
		this.emp = emp;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
