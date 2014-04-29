package com.UNI.ws.service.impl;

import com.UNI.domain.*;
import com.UNI.dto.EmployeeDTO;

import org.springframework.stereotype.Component;

@Component
public class DTOconverter {

	public DTOconverter() {

	}

	public EmployeeDTO getEmployeeDTO(final Employee employee) {
		EmployeeDTO result = new EmployeeDTO();
		result.setEmpid(employee.getId());
		result.setFirstname(employee.getFirstName());
		result.setLastname(employee.getLastName());
		result.setSalary(employee.getSalary());

		return result;
	}

	public Employee getEmployeeDomain(final EmployeeDTO employee) {
		Employee result = new Employee();

		result.setFirstName(employee.getFirstname());
		result.setLastName(employee.getLastname());
		return result;
	}
}
