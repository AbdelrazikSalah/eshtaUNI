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
 * User: Abdelrazik Date: 4/25/14
 */
@Controller
public class InsertEmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	@RequestMapping(value="/Reg", method = RequestMethod.POST)
	public String insertNewEmp(Model model,
			@RequestParam("firstname") String Firstname,
			@RequestParam("lastname") String Lastname,
			@RequestParam("salary") int Salary) {
		EmployeeWebDTO emp = employeeService.insertNewEmp(Firstname, Lastname,
				Salary);

		model.addAttribute("emp", emp);
		return "Home1";

	}

}
