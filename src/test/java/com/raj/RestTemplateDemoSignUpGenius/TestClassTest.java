package com.raj.RestTemplateDemoSignUpGenius;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.raj.RestTemplateDemoSignUpGenius.controller.TestClass;

public class TestClassTest {
	
	
	@Test
	public void addTest() {
		
		TestClass tst = new TestClass();
		int c = tst.add(1, 3);
		assertEquals(4, c);
		
	}

}
