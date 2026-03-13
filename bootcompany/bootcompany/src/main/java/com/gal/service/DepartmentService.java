package com.gal.service;

import java.util.List;

import com.gal.model.Department;

public interface DepartmentService {
	Department find(int deptId);
	List<Department> findAll();
	void addDeparment(Department dep);
	void updateDepartment(Department dep);
	void deleteDepartment(int id);
}
