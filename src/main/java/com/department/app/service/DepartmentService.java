package com.department.app.service;

import java.util.List;
import java.util.Optional;

import com.department.app.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> getDepartment(Department department);

	Department getDepartmentById(Department department);

	Optional<Department> getDepartmentById(Department department, Long id);

	List<Department> getDepartmentByLocation(Department department, String location);
}
