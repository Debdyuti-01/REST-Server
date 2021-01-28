/*package com.vogella.springboot;






import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.vogella.springboot.dto.EmployeeDTO;
import com.vogella.springboot.entity.Employee;
import com.vogella.springboot.repository.EmployeeRepository;
import com.vogella.springboot.service.EmployeeDetailsService;
import com.vogella.springboot.service.EmployeeDetailsServiceImpl;

public class ApplicationTests {
	
	@Mock
	EmployeeRepository employeeRepository;
	@InjectMocks
	EmployeeDetailsService employeeDetailsService=new EmployeeDetailsServiceImpl();
	
	@Test
	public void addEmployeeTestInvalid()
	{
		Employee emp=new Employee();
		emp.setEmployeeId(5);
		emp.setFirstName("Ramesh");
		emp.setLastName("Kumar");
		emp.setEmailId("ramesh.kumar@gmail.com");
		
		
	
		
		
		Mockito.when(employeeRepository.getEmployee(Mockito.anyInt())).thenReturn(emp);
		
		Employee actual=employeeDetailsService.addEmployee(emp);
		Assertions.assertEquals(emp, actual);
		
		
		
		
		
		
	}

}*/
