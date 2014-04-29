package com.UNI.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.UNI.dao.EmployeeDao;
import com.UNI.domain.Employee;
import com.pearlox.framework.dao.impl.BasicJpaDao;

/**
 * User: Abdelrazik
 * Date: 04/16/14
 */
@Repository
public class EmployeeDaoImpl extends BasicJpaDao<Employee> implements EmployeeDao {
    public EmployeeDaoImpl() {
        super(Employee.class);
    }


    
    @Override
    public Employee getEmployeeByname(final String firstname) {
        try {
            Query query = getEntityManager().createQuery("FROM Employee WHERE firstname=:firstname")
                    .setParameter("firstname", firstname);
            return (Employee) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        
    
}
	@Override
	public Employee getEmployeeBylastname(String lastname) {
		try {
            Query query = getEntityManager().createQuery("FROM Employee WHERE last_name=:lastname")
                .setParameter("last_name", lastname);
            return (Employee) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
	
	}

}
