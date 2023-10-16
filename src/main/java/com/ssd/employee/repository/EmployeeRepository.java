package com.ssd.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.employee.model.Employee;
import java.util.List;



public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findById(int employeeId);

	Employee findByEmpno(Long empno);
	
}
