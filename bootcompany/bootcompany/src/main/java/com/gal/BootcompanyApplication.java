package com.gal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gal.dao.DepartmentDao;
import com.gal.model.Department;
import com.gal.service.DepartmentService;
import com.gal.service.DepartmentServiceImplement;

@SpringBootApplication
public class BootcompanyApplication {
	
	private final DepartmentServiceImplement departmentServiceImplement;
	
	public BootcompanyApplication(DepartmentServiceImplement departmentServiceImplement) {
		this.departmentServiceImplement=departmentServiceImplement;
	}
	

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(BootcompanyApplication.class, args);
		DepartmentService deptService=context.getBean(DepartmentService.class);
		deptService.findAll.forEach(System.out::println);
	}

}
