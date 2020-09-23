package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class City {
    @GetMapping("/getCity/")
	public String GetCityName() {
	
		return "Delhi";
	}
	
}
