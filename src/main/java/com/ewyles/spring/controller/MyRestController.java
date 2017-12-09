package com.ewyles.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping(path="/hello/{name}")
	public String hello(@PathVariable String name)
	{
		return "Hello, " + name + "!";
	}
	
	@GetMapping(path="/goodbye/{name}")
	public String goodBye(@PathVariable String name)
	{
		return "Goodbye, " + name + "!";
	}
	
	@GetMapping(path="/hola/{name}")
	public String hola(@PathVariable String name)
	{
		return "Hola, " + name + "!";
	}
	
}
