package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimenumTest {

	@Test
	public void test() {
		PrimeNumber primenumber=new PrimeNumber();
		assertEquals("Prime Number",primenumber.prime(3));
	}
}



