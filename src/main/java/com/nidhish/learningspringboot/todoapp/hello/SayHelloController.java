package com.nidhish.learningspringboot.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello() {
		return "Hello";
	}
	
	@RequestMapping("hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}
}
