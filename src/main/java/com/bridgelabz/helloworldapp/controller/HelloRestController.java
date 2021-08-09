/**
 * UC-3 Creating a HelloWorld Application to display a message in a REST Call.
 * 
 * @author DIVYA MUNDHADA
 * @since 08.08.2021
 */
package com.bridgelabz.helloworldapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	// Annotation for mapping web requests to Spring Controller methods.
	@RequestMapping("/hello")
	public String index() {
		return "Hello From Bridgelabz";
	}
}
