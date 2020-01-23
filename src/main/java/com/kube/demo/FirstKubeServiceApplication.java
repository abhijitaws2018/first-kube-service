package com.kube.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstKubeServiceApplication {

	@RequestMapping("/")
	public String hello() {
		return "Hello Kubernetes!! finally !!! \n";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FirstKubeServiceApplication.class, args);
	}
}
