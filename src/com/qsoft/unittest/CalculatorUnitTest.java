package com.qsoft.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qsoft.Calculator;

public class CalculatorUnitTest {

//	@Test
//	public void addNumberNull() {
//
//		assertEquals(0, Calculator.add(null));
//	}
//
//	@Test
//	public void addNumberEmpty() {
//		assertEquals(0, Calculator.add(""));
//	}
//
//	@Test
//	public void addTwoNumber() {
//		assertEquals(7, Calculator.add("2,5"));
//	}
//
//	@Test
//	public void addThreeNumber() {
//		assertEquals(8, Calculator.add("2,5,1"));
//	}
//
//	@Test
//	public void addNumberNewLine() {
//		assertEquals(8, Calculator.add("2,\n5,1"));
//	}
//
//	@Test
//	public void addNumberDelimiter1() {
//		assertEquals(3, Calculator.add("//;\n1;2"));
//	}
//
//	@Test
//	public void addNumberDelimiter2() {
//		assertEquals(6, Calculator.add("//[***]\n1***2***3"));
//	}

	@Test
	public void addNumberDelimiter3() {
		assertEquals(6, Calculator.add("//[*][%]\n1*2%3"));
	}

}
