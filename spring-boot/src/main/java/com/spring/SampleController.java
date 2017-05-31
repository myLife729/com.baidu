package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
public class SampleController {

	@ResponseBody
	@RequestMapping(value="/hello")
	public String hello(){
		return "hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
	
}
