package com.department.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long requestID;
	private String customerName;
	private String customerDog;
	private String problem;
	private String location;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getRequestID() {
		return requestID;
	}

	public void setRequestID(Long requestID) {
		this.requestID = requestID;
	}

	public String getCustomerDog() {
		return customerDog;
	}

	public void setCustomerDog(String customerDog) {
		this.customerDog = customerDog;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Department(String customerName, Long requestID, String customerDog, String problem, String location) {
		this.customerName = customerName;
		this.requestID = requestID;
		this.customerDog = customerDog;
		this.problem = problem;
		this.location = location;
	}

	public Department() {
			}


	@Override
	public String toString() {
		return "Department{" +
				"requestID=" + requestID +
				", customerName='" + customerName + '\'' +
				", customerDog='" + customerDog + '\'' +
				", problem='" + problem + '\'' +
				", location='" + location + '\'' +
				'}';
	}
}
