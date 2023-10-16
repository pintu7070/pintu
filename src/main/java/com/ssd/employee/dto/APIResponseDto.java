package com.ssd.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto {

	private EmployeeDto emp;
	
	private DepartmentDto dept;
}
