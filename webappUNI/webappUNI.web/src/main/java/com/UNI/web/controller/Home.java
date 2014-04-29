package com.UNI.web.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;







/**
 * User: Abdelrazik
 * Date: 4/25/14
 */
@Controller("/")
public class Home {

	@RequestMapping(method = RequestMethod.GET)
	public String init() {
		return "InsertNewEmployee";
	}
	
	@RequestMapping(value ="/ES", method = RequestMethod.GET)
	public String init1() {
		return "EmployeeSearch";
	}
}

    
    

