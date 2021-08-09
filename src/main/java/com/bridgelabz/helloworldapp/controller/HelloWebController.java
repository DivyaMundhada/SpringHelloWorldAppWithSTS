/**
 * UC-2 Creating a HelloWorld Application to display a message in a Web Page.
 * 
 * @author DIVYA MUNDHADA
 * @since 08.08.2021
 */

package com.bridgelabz.helloworldapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

	// Annotation for mapping HTTP GET requests onto specific handler methods.
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}

	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message", "This is a custom message.");
		return "message";
	}
}