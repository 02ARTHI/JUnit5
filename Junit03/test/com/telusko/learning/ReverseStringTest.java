package com.telusko.learning;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString str = new ReverseString();
		String actual=str.reverseString("Java");
		assertEquals("avaJ", str.reverseString("Java"));
		assertEquals("ava", str.reverseString("ava"));
	}

}
