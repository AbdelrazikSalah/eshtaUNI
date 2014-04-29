package com.UNI.service.api;

import com.UNI.domain.Employee;


/**
 * User: Abdelrazik
 * Date: 04/17/14
 */
public interface Action {

	Employee getEmployeeById(Long id);

	Employee getEmployeeByname(String firstname);

	Employee getEmployeeBylastname(String lastname);

	Employee insertNewEmployee(Employee employee);

	
    
}
