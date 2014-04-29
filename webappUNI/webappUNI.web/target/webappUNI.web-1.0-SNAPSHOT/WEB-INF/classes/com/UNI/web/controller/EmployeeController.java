package com.UNI.web.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.UNI.domain.EmployeeWebDTO;
import com.UNI.service.api.*;





/**
 * User: Abdelrazik
 * Date: 4/28/14
 */
@Controller
public class EmployeeController {
	
	
	
	@Autowired
    private EmployeeService employeeService;
    
    
    
	@RequestMapping(value = "/getid",method = RequestMethod.GET)
    public String GetEmployeebyid(Model model, @RequestParam(value = "id") long id) {
    	EmployeeWebDTO emp = employeeService.getEmployeebyid(id);
    	model.addAttribute("emp", emp);
		return "Home"; 
    	
        }
        
    
   
	@RequestMapping(value = "/getfirstname", method = RequestMethod.GET)
    public String GetEmployeebyFirstname(Model model ,@RequestParam(value = "firstname") String firstname) {
    	EmployeeWebDTO emp= employeeService.getEmployeebyFirstname(firstname);
    	
    	model.addAttribute("emp", emp);
		return "Home"; 
        }
        
   
	@RequestMapping(value = "/getlastname",method = RequestMethod.GET)
    public String GetEmployeebyLastname(Model model, @RequestParam(value = "lastname") String lastname) {
    	EmployeeWebDTO	emp = employeeService.getEmployeebyLastname(lastname);
    	
    	model.addAttribute("emp", emp);
		return "Home"; 
    	
        }
        
    }
    

