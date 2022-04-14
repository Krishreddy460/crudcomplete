package com.springboot.org.crud.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.org.crud.util.DateTimeUtilities;

@RestController
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "Hello visitor!</br>Visiting time: "+DateTimeUtilities.getTime();
	}
}