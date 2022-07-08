package com.spring_boot_azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/message")
	public String message()
	{
		return "Hi congrats , your application is deployes successfully in Azure ! ";
	}
	
}
