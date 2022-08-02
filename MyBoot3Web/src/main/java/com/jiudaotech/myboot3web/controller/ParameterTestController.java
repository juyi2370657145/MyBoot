package com.jiudaotech.myboot3web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterTestController {

	@GetMapping("/car/{id}/owner/{username}")
	public Map<String, Object> getCar(@PathVariable("id") Integer id,
	                                  @PathVariable("username") String username,
	                                  @PathVariable Map<String, String> pv,
	                                  @RequestHeader("User-Agent") String userAgent,
	                                  @RequestHeader Map<String, String> header,
	                                  @RequestParam("name") String name,
	                                  @RequestParam("inters") List<String> inters,
	                                  @CookieValue("eapUsername") String cookie) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("username", username);
		map.put("map", pv);
		map.put("userAgent", userAgent);
		map.put("header", header);
		map.put("name", name);
		map.put("inters", inters);
		map.put("cookie", cookie);
		return map;
	}

	@PostMapping("/sava")
	public Map PostMethod(@RequestBody String content) {
		Map<String, Object> map = new HashMap<>();
		map.put("content", content);
		return map;
	}
}
