package com.duyhuynh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.duyhuynh.springboot.model.*;
@Controller
public class EmployeeController {
	
	@GetMapping("/employee")
	public String employee(Model model) {
		employee p1= new employee();
		p1.setId(1);
		p1.setName("Michael");
		p1.setAge(20);
		p1.setPhone("0123456789");
		model.addAttribute("p",p1);
		
		employee p2= new employee();
		p2.setId(2);
		p2.setName("Toni");
		p2.setAge(23);
		p2.setPhone("0909090909");
		model.addAttribute("a",p2);
		
		employee p3= new employee();
		p3.setId(3);
		p3.setName("Lucas");
		p3.setAge(25);
		p3.setPhone("0909091234");
		model.addAttribute("b",p3);
		
		return "Employee";
	}
}
