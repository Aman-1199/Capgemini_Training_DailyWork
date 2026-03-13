package com.gal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gal.dao.DepartmentDao;
import com.gal.dao.DepartmentRepository;
import com.gal.model.Department;
@Service
public class DepartmentServiceImplement implements DepartmentDao {
	
	DepartmentDao departmentDao;
	@Autowired
	DepartmentRepository repo;
	
	
	@Autowired
	public DepartmentServiceImplement(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}
	
	

	@Override
	public Department find(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}



	@Override
	public List<Department> findAll() {
		return repo.findAll();
	}

	@Override
	public void addDepartment(Department dep) {
		repo.save(dep);
		
	}

	@Override
	public void updateDepartmentId(Department dep) {
		repo.save(dep);
		
	}

	@Override
	public void deleteDepartment(int id) {
		repo.deleteById(id);
		
	}



	
	
	

}
