package com.schooladmin.teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class TeacherServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
