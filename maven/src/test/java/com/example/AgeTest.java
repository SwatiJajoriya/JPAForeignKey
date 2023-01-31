package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {
	//@Test tell that this method is a test method
	//Expected output==actual output ->Pass ,  EO!=AO->Fail	
		@Test
		public void test() {
			AgeValidation agevalid=new AgeValidation();
			assertEquals("right to vote",agevalid.ageVerifier(19));
		}

	}
