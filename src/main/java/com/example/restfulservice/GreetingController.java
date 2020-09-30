package com.example.restfulservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private static final String template2 = "Ayy %s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	@GetMapping("/jeff")
	public Test test(@RequestParam(value = "content", defaultValue = "AyyLmao")String content) {
		return new Test(String.format(template2, content));
	}
	

}
