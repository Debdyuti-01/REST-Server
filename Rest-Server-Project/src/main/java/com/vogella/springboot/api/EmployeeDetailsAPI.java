package com.vogella.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vogella.springboot.entity.Employee;
import com.vogella.springboot.service.EmployeeDetailsService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeDetailsAPI {
	
	@Autowired
	private EmployeeDetailsService employeeDetailsService;
	@Autowired
	private Environment environment;
	
	@GetMapping("{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer employeeId)
	{
	
		Employee emp=employeeDetailsService.getEmployee(employeeId);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	

	}
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee obj)
	{
		return new ResponseEntity<Employee>(employeeDetailsService.addEmployee(obj),HttpStatus.OK);
		
	}
}
