package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.TestMe;

public class TestMeTests {

	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe  = new TestMe();
    }

	@Test
	public void squareTest() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}
	@Test
	public void cubeTest() {

		double baseValue = 3.0;
		double expected = 6.0*baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.cube();

		assertTrue(actual == expected);

	}
	@Test 
	public void addTwoTest() {
		int baseInteger = 3;
		int expected = baseInteger + 2;
		testMe.setInt(3);
		int actual = testMe.addTwo();

		assertTrue(actual == expected);
	}
	@Test
	public void scaleBySixTest() {

		int baseInteger = 3;
		int expected = baseInteger * 6;
		testMe.setInt(3);
		int actual = testMe.scaleBySix();

		assertTrue(actual == expected);

	}

}
