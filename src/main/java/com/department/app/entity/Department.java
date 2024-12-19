package com.department.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long RequestID;
	private String CustomerName;
	private String CustomerDog;
	private String Problem;
	private String Location;


	public Long getRequestID() {
		return RequestID;
	}

	public void setRequestID(Long requestID) {
		this.RequestID = requestID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		this.CustomerName = customerName;
	}

	public String getCustomerDog() {
		return CustomerDog;
	}

	public void setCustomerDog(String customerDog) {
		this.CustomerDog = customerDog;
	}

	public String getProblem() {
		return Problem;
	}

	public void setProblem(String problem) {
		this.Problem = problem;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		this.Location = location;
	}

	public Department(Long requestID, String customerName, String customerDog, String problem, String location) {
		this.RequestID = requestID;
		this.CustomerName = customerName;
		this.CustomerDog = customerDog;
		this.Problem = problem;
		this.Location = location;
	}

	public Department() {
			}

	@Override
	public String toString() {
		return "Department{" +
				"RequestID=" + RequestID +
				", CustomerName='" + CustomerName + '\'' +
				", CustomerDog='" + CustomerDog + '\'' +
				", Problem='" + Problem + '\'' +
				", Location='" + Location + '\'' +
				'}';
	}
}
