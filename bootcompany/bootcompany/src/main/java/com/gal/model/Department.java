package com.gal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Department {
	@Id
	@Column(name="department_id")
	int department;
	
	@Column(name="department_name")
	String deptName;
	
	@Column(name="manager_id")
	int managerId;

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Department [department=" + department + ", deptName=" + deptName + ", managerId=" + managerId + "]";
	}
	

	

}
