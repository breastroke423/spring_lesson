package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{
	public void hello() {
		System.out.println("Hello");
	}
}
