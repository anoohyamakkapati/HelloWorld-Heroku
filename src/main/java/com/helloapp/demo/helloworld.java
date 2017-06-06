package com.helloapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class helloworld {
	@RequestMapping("/")
	@ResponseBody
public String hello(){
	return " Hello World";
}
	@RequestMapping("/anoohya")
	@ResponseBody
public String anoohya(){
	return " Hello Anoohya! Welcome to Spring Boot App";
}

}
