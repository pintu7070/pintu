package com.ssd.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
	//comm, sal, deptcode, empno, ename, hiredate, job, mgr
	@Id
   	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
   	private Long empno;
    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private Double sal;
    private Double comm;
    private Long deptcod;
    
	public Employee(Long empno, String ename, String job, String mgr, String hiredate, Double sal, Double comm,
			Long deptcod) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptcod = deptcod;
	}
    
    
}