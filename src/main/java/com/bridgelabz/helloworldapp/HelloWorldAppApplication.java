/**
 * UC-1 Creating a HelloWorld Application to display a message using STS.
 * 
 * @author DIVYA MUNDHADA
 * @since 08.08.2021
 */
package com.bridgelabz.helloworldapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldAppApplication.class, args);
		System.out.println("Hello From Bridgelabz.");
	}

}