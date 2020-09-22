
package com;

/**
 * @author Pradeep
 *
 */
public class Employee {
    String Name;
    String Id;
    String Dept;
    int YearofBirth;
    int salary;
    int AppraiselRating;
    
    public Employee SetEmp(String Name, String Id,String Dept,int year,int sal)
    {
    	Employee e = new Employee();
    	e.Name= Name;
    	e.Id= Id;
    	e.Dept = Dept;
    	e.salary=sal;
    	e.YearofBirth = year;		
    	e.AppraiselRating=4;
    	return e;
    }
    
}
