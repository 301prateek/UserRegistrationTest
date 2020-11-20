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

	public boolean validatePhoneNumber(String phoneNumber) {

		String expression = "^[+]?[0-9]{2,3}[ ]+[6-9]{1}[0-9]{9}";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(phoneNumber).matches();
	}

	public boolean validatePassword(String password) {

		String expression = "^(?=.+[0-9])(?=.+[a-z])(?=.+[A-Z])(?=.*[a-zA-Z])(?=.+[!@#$%^&*]).{8,}$";

		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(password).matches();
	}
}
