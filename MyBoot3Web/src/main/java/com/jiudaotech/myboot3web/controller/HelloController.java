package com.jiudaotech.myboot3web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/flow1.png")
	public String hello(@RequestParam("name") String name) {
		return name;
	}

	@GetMapping(value = "/user")
	public String getUser(){
		return "GET-张三";
	}

	@PostMapping(value = "/user")
	public String saveUser(){
		return "POST-张三";
	}


	@PutMapping(value = "/user")
	public String putUser(){
		return "PUT-张三";
	}

	@RequestMapping(value = "/user",method = RequestMethod.DELETE)
	public String deleteUser(){
		return "DELETE-张三";
	}
}
