package com.ssd.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.employee.dto.APIResponseDto;
import com.ssd.employee.dto.EmployeeDto;
import com.ssd.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto dto)
	{
		return new ResponseEntity<EmployeeDto>(employeeService.saveEmployee(dto),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<APIResponseDto> getEmployee(@PathVariable long id)
	{
		return new ResponseEntity<APIResponseDto>(employeeService.getEmployeeById(id),HttpStatus.OK);
	}
}
