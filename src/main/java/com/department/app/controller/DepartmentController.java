package com.department.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/Departments")
	public List<Department> getDepartment(@RequestBody Department department) {
		return departmentService.getDepartment(department);
		
	}
	
	@GetMapping("/Department/{id}")
	public Optional<Department> getDepartmentById(@RequestBody Department department,@PathVariable Long id) {
		return departmentService.getDepartmentById(department, id);
		
	}
	

}
