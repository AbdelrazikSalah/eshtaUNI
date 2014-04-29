package com.UNI.ws.service.impl;



import com.UNI.domain.Employee;
import com.UNI.dto.EmployeeDTO;
import com.UNI.service.api.Action;
import com.UNI.ws.service.api.EmployeeWS;


import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;


/**
 * User: Abdelrazik
 * Date: 04/17/14
 */
public class EmployeeWebServiceImpl implements EmployeeWS {
    
    @Autowired
    private Action action;
    
    @Autowired
    private DTOconverter converter;


	@Override
	public EmployeeDTO getEmpid(long id) {
		Employee emp = action.getEmployeeById(id);
		EmployeeDTO employeeDTO = converter.getEmployeeDTO(emp);
        return employeeDTO;
	}

	@Override
	public EmployeeDTO getFirstname(String firstname) throws Exception {
		Employee emp = action.getEmployeeByname(firstname);
		EmployeeDTO employeeDTO = converter.getEmployeeDTO(emp);
        return employeeDTO;
		
       
    }
	
	

	@Override
	public EmployeeDTO getLastname(String lastname) throws Exception {
		Employee emp = action.getEmployeeBylastname(lastname);
		EmployeeDTO employeeDTO = converter.getEmployeeDTO(emp);
        return employeeDTO;
		
		
        	}

	@Override
	public EmployeeDTO insertNewEmp( String Firstname, String Lastname, int Salary) {
		Employee emp = new Employee();
		emp.setFirstName(Firstname);
		emp.setLastName(Lastname);
		emp.setSalary(Salary);
		Employee e = action.insertNewEmployee(emp);
		// create new employee DTO and fill it from e
		DTOconverter converter = new DTOconverter();
		EmployeeDTO result = converter.getEmployeeDTO(e);
		return result;
	}

	
	

	
	


    
	

	
}
