package com.zy.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student/")
public class StudentController {
	
	
	
	@RequestMapping("show")
	public String show(Model model) {
		System.out.println("hello....");
		model.addAttribute("name","张三");
		
		return "show";
	}
}
