package com.tops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@GetMapping("/")
	public String msg()
	{
		return "Hello Welcome to Rahul AWS Project";
	}
}
