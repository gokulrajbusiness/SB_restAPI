package com.department.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long depID;
	private String depName;
	private String depAdddress;
	private String DepCode;
	
	
	public Long getDepID() {
		return depID;
	}
	public void setDepID(Long depID) {
		this.depID = depID;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepAdddress() {
		return depAdddress;
	}
	public void setDepAdddress(String depAdddress) {
		this.depAdddress = depAdddress;
	}
	public String getDepCode() {
		return DepCode;
	}
	public void setDepCode(String depCode) {
		DepCode = depCode;
	}

	
	public Department(Long depID, String depName, String depAdddress, String depCode) {
		super();
		this.depID = depID;
		this.depName = depName;
		this.depAdddress = depAdddress;
		DepCode = depCode;
	}
	
	@Override
	public String toString() {
		return "Department [depID=" + depID + ", depName=" + depName + ", depAdddress=" + depAdddress + ", DepCode="
				+ DepCode + "]";
	}
	public Department() {
			}
	
	
	

}
