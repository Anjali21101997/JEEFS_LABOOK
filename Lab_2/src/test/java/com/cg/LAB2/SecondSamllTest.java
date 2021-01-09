package com.cg.LAB2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SecondSamllTest {
	private SecondSmall secondsmall;
	
	@Before
	public void setup() {
		secondsmall=new SecondSmall();
	}

	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int newNumber[]= {};
		int result=secondsmall.getSecondSmallest(newNumber);
		assertEquals(0, result);
}
	@Test
	public void test_getSecondSmallest_Given1IntegerArray_ShouldReturn1AsInteger() {
		int newNumber[]= {1};
		int result=secondsmall.getSecondSmallest(newNumber);
		assertEquals(1, result);

}
	@Test
	public void test_getSecondSmallest_Given2IntegerArray_ShouldReturnSecSmallAsInteger() {
		int newNumber[]= {21,23};
		int result=secondsmall.getSecondSmallest(newNumber);
		assertEquals(23, result);

}
}


	