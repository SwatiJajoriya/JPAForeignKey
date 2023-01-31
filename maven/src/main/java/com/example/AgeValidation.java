package com.example;

public class AgeValidation {

	public String ageVerifier(int age) {
		if(age>=18) {
			return "right to vote";
		}
		else{
			return "not eligible";
		}
	}
}


