package com.jiudaotech.myboot3web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/flow1.png")
	public String hello() {
		return "flow0.png";
	}

}
