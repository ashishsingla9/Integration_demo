package com.demo.entrypoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		SpringApplication.run(EntryPoint.class, args);
	}

}
