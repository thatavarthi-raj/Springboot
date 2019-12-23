package com.spring.boot2.war.tomcat9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello world";
	}
}