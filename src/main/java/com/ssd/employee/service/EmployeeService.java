package com.ssd.employee.service;

import com.ssd.employee.dto.APIResponseDto;
import com.ssd.employee.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto saveEmployee(EmployeeDto dto);

	public EmployeeDto getByEmployeeNo(long empNo);

	APIResponseDto getEmployeeById(long id);
}
