package com.ssd.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
		private Long empno;
	    private String ename;
	    private String job;
	    private String mgr;
	    private String hiredate;
	    private Double sal;
	    private Double comm;
	    private Long deptcod;
}
