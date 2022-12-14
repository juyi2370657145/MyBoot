package atjiudaotech.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atjiudaotech.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {

	@Autowired
	Car car;

	@RequestMapping("/car")
	public Car car() {
		log.info("get car!");
		return car;
	}

	@RequestMapping("/hello")
	public String handle01(@RequestParam("name") String name) {
		return "Hello, Spring Boot 2!" + "你好:" + name;
	}

}
