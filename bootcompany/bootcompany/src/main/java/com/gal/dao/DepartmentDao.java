package com.gal.dao;

import java.util.List;

import com.gal.model.Department;

public interface DepartmentDao {
	Department find(int deptId);
	List<Department> findAll();
	void addDeparment(Department dep);
	void updateDepartment(Department dep);
	void deleteDepartment(int id);
}
