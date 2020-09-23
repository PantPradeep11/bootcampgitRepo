package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestEmployee {
	
	EmployeeService empobj = new EmployeeService();
	@Test
	public void testAge()
	{
		Assertions.assertEquals(empobj.GetEmployeeAge(2000),20);
	}
	@Test
	public void testMinor()
	{
		Assertions.assertFalse(empobj.CheckEmployeeMinor(2000));
	}
	@Test
	public void testBasicSal()
	{
		Assertions.assertEquals(empobj.GetBasic(40000),20000);
	}

	/*
	 * @Test public void testPost() { Employee e1 = new Employee(); e1.Id="01";
	 * e1.Name="Rojer"; e1.Dept="HR";
	 * Assertions.assertEquals(empobj.SaveEmp(e1),"success"); }
	 */
	@Test
	public void testDept()
	{
		
		String Dept="IT";
		Assertions.assertEquals(empobj.GetDept(Dept),"IT");
	}
	

}
