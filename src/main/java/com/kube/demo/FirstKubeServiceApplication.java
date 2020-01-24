package com.kube.demo;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstKubeServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(FirstKubeServiceApplication.class);
	
	@RequestMapping("/")
	public String hello() throws UnknownHostException {
		String message = "Hello Kubernetes!! finally !!! Joyka, kemon acchis !!!!\n "
				+ new Date() + ". Server name : " + Inet4Address.getLocalHost().getHostName() +"\n";
		LOGGER.info(message);
		return message;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FirstKubeServiceApplication.class, args);
	}
}
