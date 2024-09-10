package com.jurist101.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebserviceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WebserviceApplication.class, args);
	}

}
