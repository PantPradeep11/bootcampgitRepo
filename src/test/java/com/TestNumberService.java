package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestNumberService {
	
	NumberService numobj = new NumberService();
	@Test
	public void testMaxnumber()
	{
		Assertions.assertEquals(numobj.FindMax(10,30),30);
	}
	
	@Test
	public void testOddEven()
	{
		Assertions.assertEquals(numobj.EvenOdd(6),"even");
	}
	
	@Test
	public void testDigit()
	{
		//Assertions.assertEquals(numobj.IsDigit('5'),true);
		Assertions.assertTrue(numobj.IsDigit('5'));
	}
	
	@Test
	public void testPower()
	{
		Assertions.assertEquals(numobj.GetPower(3, 3),27.0);
	}
	
	@Test
	public void testSqrt()
	{
		Assertions.assertEquals(numobj.GetSqureRoot(16),4.0);
	}




}
