package com.vogella.springboot.service;




import com.vogella.springboot.entity.Employee;

public interface EmployeeDetailsService {
	
	public Employee getEmployee(Integer employeeId);
	public Employee addEmployee(Employee obj);
}
