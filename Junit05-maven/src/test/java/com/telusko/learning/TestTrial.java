package com.telusko.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTrial {
	
	Shapes c = new Shapes();

	@Test
	public void test() {
		assertEquals(6, 3+3);
	}
	
	@Test
	public void area() {
		assertEquals(4, c.area(2));
		
	}
	@Test
	public void radius()
	{
	   int actual=c.area(2);
		assertEquals(4, actual);
	}

}
