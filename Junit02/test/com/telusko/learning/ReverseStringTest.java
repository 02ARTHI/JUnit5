package com.telusko.learning;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.telusko.learning.ReverseString;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString str = new ReverseString();
		assertEquals("av",str.reverseString("va"));
	}

}
