package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberService {
 
	@GetMapping("/FindMax/{num1}/{num2}")
	public  int FindMax(@PathVariable("num1") int a,@PathVariable("num2") int b) {
		//int a=10, b=20;
		if(a>b)
		{
			return a;
		}
		else 
		{
			return b;
		}
	}
	
	@GetMapping("/EvenOrOdd/{num1}")
	public  String EvenOdd(@PathVariable("num1") int a) {		
		if(a%2==0)
		{
			return "even";
		}
		else 
		{
			return "odd";
		}
	}
	
	@GetMapping("/IsDigit/{num1}")
	public  boolean IsDigit(@PathVariable("num1") char a) {		
		if(Character.isDigit(a))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	@GetMapping("/Power/{num1}/{num2}")
	public  double GetPower(@PathVariable("num1") int number,@PathVariable("num2") int p) {		
		return   Math.pow(number, p);
	}
	@GetMapping("/SQRT/{num1}")
	public  double GetSqureRoot(@PathVariable("num1") int number) {		
		return Math.sqrt(number);
	}
	
}
