package com.department.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.app.entity.Department;
import com.department.app.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/Departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
		
	}

}
