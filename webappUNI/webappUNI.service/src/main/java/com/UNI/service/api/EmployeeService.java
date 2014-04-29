package com.UNI.service.api;

import org.springframework.stereotype.Service;

import com.UNI.domain.EmployeeWebDTO;


@Service
public interface EmployeeService {
	
	EmployeeWebDTO getEmployeebyid( long id);
	EmployeeWebDTO getEmployeebyFirstname( String firstname);
	EmployeeWebDTO getEmployeebyLastname( String lastname);
	EmployeeWebDTO insertNewEmp( String Firstname, String Lastname, int Salary);

}
