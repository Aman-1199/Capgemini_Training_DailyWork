package com.gal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gal.model.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@Component
public class DepartmentDaoImpl implements DepartmentDao {
	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public Department find (int deptId) {
		EntityManager em=emf.createEntityManager();
		Department dept=em.find(Department.class, deptId);
		return dept;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDeparment(Department dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDepartment(Department dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDepartment(int id) {
		// TODO Auto-generated method stub
		
	}

}
