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

	public boolean validateEmailAddress(String email) {
		String expression = "^[0-9a-zA-Z]+([.])?([-_\\+])?([0-9A-Za-z])*[@]{1}([0-9A-Za-z])+[.]{1}[a-z)]+[.]*[a-z]*{2}$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(email).matches();
	}
}
