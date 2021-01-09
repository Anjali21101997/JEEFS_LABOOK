package com.cg.LAB2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArraySortTest {
	ArraySort arraysort;
	@Before
	public void setup()
	{
		arraysort=new ArraySort();
	}
	@Test
	public void test_getSorted_GivenEmptyIntegerArray_ShowReturn0AsInteger() {
		int newNumbers[]= {};
		int[] result=arraysort.getSorted(newNumbers);
		int a=result.length;
		assertEquals(0,a);
		}
	@Test
	public void test_getSorted_Given1IntegerArray_ShowReturn1AsInteger() {
		int newNumbers[]= {12};
		int[] result=arraysort.getSorted(newNumbers);
		assertEquals(21,result[0]);
	}
	
	
	@Test
	public void test_getSorted_Given2IntegerArray_ShowReturn2AsInteger() {
		int newNumbers[]= {12,31,11};
		int[] result=arraysort.getSorted(newNumbers);
		assertEquals(11,result[0]);
	
		
	}

}

