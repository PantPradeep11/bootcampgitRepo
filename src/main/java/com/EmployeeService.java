package com;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {
	
	

	@GetMapping("/GetAge/{yob}")
	public int GetEmployeeAge(@PathVariable("yob") int a)
	{
		//Date d=new Date();
		return 2020 - a;
		
	}
	@GetMapping("/IsMinor/{yob}")
	public boolean CheckEmployeeMinor(@PathVariable("yob") int a)
	{
		Date d=new Date();
	
		int diff= 2020 - a;
		
		if(diff>=18)
		{
			return false;
		}
		else 
		{
			return true;
		}
		
	}
	
	@GetMapping("/GetDept/{Dept}")
	public String GetDept(@PathVariable("Dept") String Dept)
	{
		Employee e1= new Employee();
		
		e1.SetEmp("John", "E01", Dept, 1998, 5000);
		
	  
		return Dept;
		
	}
	
	@GetMapping("/getBasic/{totalsal}")
	public int GetBasic(@PathVariable("totalsal") int totalsal)
	{
		
		
	  
		return (totalsal * 50)/100;
		
	}
	
	@PostMapping
	public String SaveEmp(@RequestBody Employee emp)
	{
		Employee e1= new Employee();	
		if(emp.Id!="0")
		{
			
		e1.SetEmp(emp.Name, emp.Id, emp.Dept, emp.YearofBirth, emp.salary);	  
		return "success";
		}
		else
		{
			return "error";
		}
		
		
	}
	
	
	
	
	
}






	
	
	
