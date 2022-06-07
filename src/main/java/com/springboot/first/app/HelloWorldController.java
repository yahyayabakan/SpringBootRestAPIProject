package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
	// http://localhost:8000/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
}
