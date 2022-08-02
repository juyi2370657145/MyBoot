package com.atjiudaotech.myboot2.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atjiudaotech.myboot2.bean.Person;

@RestController
public class HelloController {

	@Autowired
	Person person;

	@RequestMapping("/person")
	public Person person() {
		return person;
	}
}
