package com.ssd.employee.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ssd.employee.dto.APIResponseDto;
import com.ssd.employee.dto.DepartmentDto;
import com.ssd.employee.dto.EmployeeDto;
import com.ssd.employee.model.Employee;
import com.ssd.employee.repository.EmployeeRepository;
import com.ssd.employee.service.APIClint;
import com.ssd.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private APIClint apiClint;
	
	@Autowired
	private ModelMapper mapper;

	public Employee employee=null;
	
	@Override
	public EmployeeDto saveEmployee(EmployeeDto dto) {
		employee=mapToEntity(dto);
		employee=employeeRepository.save(employee);
		return mapToDto(employee);
	}

	@Override
	public EmployeeDto getByEmployeeNo(long empNo) {
		employee=employeeRepository.findById(empNo).get();
		return mapToDto(employee);
	}
	
	
	@Override
	public APIResponseDto getEmployeeById(long employeeId) {

		employee=employeeRepository.findById(employeeId).get();
//	System.out.println(employee);	
		DepartmentDto departmentDto=apiClint.getDepartment(employee.getDeptcod());	
		EmployeeDto empDto=mapToDto(employee);		
		APIResponseDto apiResponseDto=new APIResponseDto();
		apiResponseDto.setDept(departmentDto);
		apiResponseDto.setEmp(empDto);
		return apiResponseDto;
	}
	
	
	
	public EmployeeDto mapToDto(Employee dto)
	{
		return mapper.map(dto, EmployeeDto.class);
	}
	
	public Employee mapToEntity(EmployeeDto dto)
	{
		return mapper.map(dto, Employee.class);
	}

	
	
}