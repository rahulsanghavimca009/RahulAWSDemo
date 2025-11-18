package com.tops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@GetMapping("/")
	public String msg()
	{
		System.out.println("hhh");
		return "Hello Welcome to Rahul AWS Project";
	}
}
