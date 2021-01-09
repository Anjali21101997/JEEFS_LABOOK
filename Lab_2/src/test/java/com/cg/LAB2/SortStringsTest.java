package com.cg.LAB2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortStringsTest {
	SortStrings sortstrings;
	@Before
	public void setup()
	{
		sortstrings=new SortStrings();
	}

	@Test
	public void testGetSortedStrings_IfEmpty_ReturnsNull() {
		String[] input= {""};
		String result=sortstrings.getSortedStrings(input);
		int len=result.length();
		assertEquals(0,len);
		
	}
	@Test
	public void testGetSortedStrings_IfInput1_ReturnsUpperCase() {
		String[] input= {"aabbccdd"};
		String result=sortstrings.getSortedStrings(input);
		assertEquals("AABBCCDD",result);
	}
	@Test
	public void testGetSortedStrings_IfInput2_ReturnsUpperCaseandLowerCase() {
			String[] input= {"aabbccdd","aabbcd"};
			String result=sortstrings.getSortedStrings(input);
			assertEquals("[AABBCCDD, aabbcd]",result);
		
		
	}

}
