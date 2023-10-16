package com.ssd.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
	private long id;
	private String departmentName;
	private String departmentDescription;
	private String departmentLocation;
	private Long deptcode;
}
