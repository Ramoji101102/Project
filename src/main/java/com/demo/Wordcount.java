package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wordcount {
	@GetMapping("/first")
	public String getData() {

		return"countWords";
	}
	
}
