package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SampleService;

@RestController
@RequestMapping("demo/sample")
public class SampleController {
	private final SampleService service;
	public SampleController(SampleService service) {
		this.service = service;
	}
	@GetMapping
	public void hello() {
		service.hello();
	}
}
