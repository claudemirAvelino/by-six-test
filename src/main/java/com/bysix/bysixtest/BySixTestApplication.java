package com.bysix.bysixtest;

import com.bysix.bysixtest.exerciseone.service.PrintNumberService;
import com.bysix.bysixtest.exercisetwo.service.CountriesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BySixTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BySixTestApplication.class, args);
		System.out.println("EXERCISE 1");
		new PrintNumberService().print();
		System.out.println("");
		System.out.println("");
		System.out.println("EXERCISE 2");
		new CountriesService().execute();
	}

}
