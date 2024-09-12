package com.unlogged.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unlogged.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
