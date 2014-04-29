package com.UNI.domain;

import com.pearlox.framework.domain.BasicObject;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Andrew
 * Date: 6/18/13
 */
@SuppressWarnings("serial")
@XmlRootElement
public class EmployeeWebDTO extends BasicObject {
	
private long Empid;
	
	private String firstname;
    
    private String lastname;
    private int salary;
    

    public int getSalary() {
		return salary;
	}

    public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getEmpid() {
		return Empid;
	}

	public void setEmpid(long Empid) {
		this.Empid = Empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
    
    
    
}
