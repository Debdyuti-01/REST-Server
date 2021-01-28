package com.vogella.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vogella.springboot.entity.Employee;
import com.vogella.springboot.repository.EmployeeRepository;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee getEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(employeeId);
	}
	@Override
	public Employee addEmployee(Employee obj) {
		// TODO Auto-generated method stub
		return employeeRepository.save(obj);
	}
	
}