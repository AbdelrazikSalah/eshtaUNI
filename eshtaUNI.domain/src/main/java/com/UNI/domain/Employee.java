package com.UNI.domain;

import com.pearlox.framework.domain.BasicObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: Abdelrazik
 * Date: 04/16/14
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "Employee")
public class Employee extends BasicObject {


	
	private String firstName;
    
    private String lastName;
    
    private int salary;
    
    
  

    
	@Column(name = "firstname")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastname")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "salary")
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


    
    
}
