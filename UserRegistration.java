package com.uservalidation.main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String name) {
		String expression = "^[A-Z]{1}[a-z]{2,}$";

		if(name.matches(expression))
			return true;
		else
			return false;
	}

	public boolean validateLastName(String name) {
		String expression = "^[A-Z]{1}[a-z]{2,}$";

		if(name.matches(expression))
			return true;
		else
			return false;
	}
}
