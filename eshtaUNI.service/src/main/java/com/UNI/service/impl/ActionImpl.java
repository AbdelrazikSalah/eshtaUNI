package com.UNI.service.impl;


import com.UNI.dao.EmployeeDao;
import com.UNI.domain.Employee;
import com.UNI.service.api.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Abdelrazik
 * Date: 04/17/14
 */
@Service
public class ActionImpl implements Action {
    
    @Autowired
    private EmployeeDao employeeDao;
    
    
    
    @Override
    public Employee getEmployeeById(final Long id) {
        Employee result = null;
		try {
			result = employeeDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return result;
    }
    
    @Override
    public Employee getEmployeeByname(final String firstname) {
        Employee result = employeeDao.getEmployeeByname(firstname);
        return result;
    }
    
    @Override
    public Employee getEmployeeBylastname(final String lastname) {
        Employee result = employeeDao.getEmployeeByname(lastname);
        return result;
    }

	@Override
	public Employee insertNewEmployee(Employee employee) {
		
		try {
			return employeeDao.saveOrUpdate(employee);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
