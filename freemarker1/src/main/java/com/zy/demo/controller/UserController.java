package com.zy.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index/")
public class UserController {
	@RequestMapping("test")
	public String index(Model model) {
		System.out.println("hello....");
		model.addAttribute("user", "张三");
		return "user";
	}
	
	
	@RequestMapping("show")
	public String show(Model model) {
		System.out.println("hello....");
		model.addAttribute("name","张三");
		
		model.addAttribute("ps","123");
		return "show";
	}
	
	
}
