package com.bysix.bysixtest;

import com.bysix.bysixtest.exerciseone.service.PrintNumberService;
import com.bysix.bysixtest.exercisetwo.service.CountriesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BySixTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BySixTestApplication.class, args);
		//new PrintNumberService().print();
		new CountriesService();
	}

}
