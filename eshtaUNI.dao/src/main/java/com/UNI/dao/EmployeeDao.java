package com.UNI.dao;

import com.pearlox.framework.dao.BasicDao;
import com.UNI.domain.Employee;


/**
 * User: Abdelrazik
 * Date: 04/16/14
 */
public interface EmployeeDao extends BasicDao<Employee> {
    
	Employee getEmployeeByname(String firstname);
	
	Employee getEmployeeBylastname(String lastname);

}
