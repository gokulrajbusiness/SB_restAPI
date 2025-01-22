package com.department.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.app.entity.Department;
import com.department.app.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
	
	@Override
	public Optional<Department> getDepartmentById(Department department,Long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id);
	}

	@Override
	public Department getDepartmentById(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getDepartmentByLocation(Department department, String location) {
		// TODO Auto-generated method stub
		return departmentRepository.findByLocation(location);
	}


}
