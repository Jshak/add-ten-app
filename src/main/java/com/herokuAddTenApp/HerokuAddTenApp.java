package com.herokuAddTenApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuAddTenApp {
	@GetMapping(value = "/{num}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> addTen(@PathVariable int num) {
	int sum = 10+num;
	HashMap<String,String> map = new HashMap<>();
	map.put("sum", String.valueOf(sum));
    return map;
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to the spring boot app deployed to HEROKU";
	}
}
