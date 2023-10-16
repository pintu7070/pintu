package com.ssd.employee.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ssd.employee.dto.DepartmentDto;

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClint {
	@GetMapping("api/v1/department/{dept-code}")
	DepartmentDto getDepartment(@PathVariable ("dept-code") long deptcode);
}
