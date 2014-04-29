package com.UNI.dto;

import com.pearlox.framework.converter.DomainClassRef;
import com.pearlox.framework.dto.BasicDTO;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Abdelrazik
 * Date: 04/16/14
 */
@SuppressWarnings("serial")
@XmlRootElement
@DomainClassRef(name = "Employee")
public class EmployeeDTO extends BasicDTO {
    
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
