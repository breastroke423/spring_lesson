package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.HelloForm;

@Controller
@RequestMapping("demo/hello")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {
		HelloForm form = new HelloForm();
		model.addAttribute(form);
		return "hello/input";
	}
	
}
