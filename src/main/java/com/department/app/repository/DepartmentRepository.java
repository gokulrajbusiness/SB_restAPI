package com.department.app.repository;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import com.department.app.entity.Department;

import jakarta.persistence.EntityManager;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	

	

	
	

}
