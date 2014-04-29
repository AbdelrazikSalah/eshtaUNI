package com.UNI.service.impl;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.helpers.LogLog;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import com.UNI.domain.EmployeeWebDTO;
import com.UNI.service.api.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService   {

	public EmployeeServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
   
    public EmployeeWebDTO getEmployeebyid( long id) {
    	
    	GetMethod EmployeeWS = new GetMethod("http://localhost:8091/api/getEmpid?id="+id);
        HttpClient client = new HttpClient();
      
        try {
            int status = client.executeMethod(EmployeeWS);
            if (status == HttpStatus.SC_OK) {
           
            	EmployeeWebDTO  employee1= new ObjectMapper().readValue(EmployeeWS.getResponseBodyAsString(), EmployeeWebDTO.class);
            	return employee1;
            } else {
                
            }
        } catch (Exception e) {
           e.printStackTrace();

       
    	
        }
		return null;
        
    }
    
    public EmployeeWebDTO getEmployeebyFirstname( String firstname) {
    	
    	GetMethod EmployeeWS = new GetMethod("http://localhost:8091/api/getFirstname?firstname="+firstname);
        HttpClient client = new HttpClient();
        
        try {
            int status = client.executeMethod(EmployeeWS);
            if (status == HttpStatus.SC_OK) {
            	//GetID = EmployeeWS.getResponseBodyAsString();
            	EmployeeWebDTO  employee1= new ObjectMapper().readValue(EmployeeWS.getResponseBodyAsString(), EmployeeWebDTO.class);
            	 return employee1;
            } else {
                
            }
        } catch (Exception e) {
           e.printStackTrace();

       
    	
        }
		return null;
        
    }
    public EmployeeWebDTO getEmployeebyLastname( String lastname) {
    
    	GetMethod EmployeeWS = new GetMethod("http://localhost:8091/api/getLastname?lastname="+lastname);
        HttpClient client = new HttpClient();
   
        try {
            int status = client.executeMethod(EmployeeWS);
            if (status == HttpStatus.SC_OK) {
            	//GetID = EmployeeWS.getResponseBodyAsString();
            	EmployeeWebDTO  employee1= new ObjectMapper().readValue(EmployeeWS.getResponseBodyAsString(), EmployeeWebDTO.class);
            	 return employee1;
            } else {
                
            }
        } catch (Exception e) {
           e.printStackTrace();

        
    	
        }
		return null;
        
    }
    
    public EmployeeWebDTO insertNewEmp( String firstname, String lastname, int salary){
    	
    
        PostMethod EmployeeWS = new PostMethod("http://localhost:8091/api/insertNewEmp");
        HttpClient client = new HttpClient();    
        EmployeeWS.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        NameValuePair[] namedParameter = new NameValuePair[3];
        namedParameter[0] = new NameValuePair("firstname", firstname);;
        namedParameter[1] = new NameValuePair("lastname", lastname);
        namedParameter[2] = new NameValuePair("salary", Integer.toString(salary));;
        EmployeeWS.setRequestBody(namedParameter);

        try {
            int status = client.executeMethod(EmployeeWS);
            if (status == HttpStatus.SC_OK) {
            	EmployeeWebDTO  employee1= new ObjectMapper().readValue(EmployeeWS.getResponseBodyAsString(), EmployeeWebDTO.class);
            	return employee1;
            } else {
                LogLog.error("Status Code : " + status);
                
                
            }
        } catch (Exception e) {
           e.printStackTrace();
        }

        return null;
    }
    

}
