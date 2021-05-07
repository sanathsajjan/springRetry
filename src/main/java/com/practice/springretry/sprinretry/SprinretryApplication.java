package com.practice.springretry.sprinretry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;

import javax.annotation.PostConstruct;

@EnableRetry
//@ComponentScan("com.practice.springretry.sprinretry")
@SpringBootApplication
public class SprinretryApplication {


	@Autowired
	private SpringRetryService springRetryService;

	//Added @PostConstruct otherwise springRetryService bean will be null in my main class.

	@PostConstruct
	public void executeTest(){
		System.out.println(springRetryService.test("test"));
	}
	public static void main(String[] args) {
		SpringApplication.run(SprinretryApplication.class, args);
	}

}
