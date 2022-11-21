package com.schooladmin.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
