package com.vogella.springboot.repository;


import org.springframework.data.repository.CrudRepository;

import com.vogella.springboot.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{
	

}
