package com.duyhuynh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class springbootController {
	@GetMapping("/hi")
	public String hello(Model model) {
		
		return "Hello" ;
		
	}
	@GetMapping("/sth")
	public String diamond(Model model) {
		
		return "Diamond" ;
		
	}
}
