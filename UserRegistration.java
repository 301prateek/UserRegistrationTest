package com.uservalidation.test;

import org.junit.Test;
import org.junit.Assert;

import org.junit.Test;

import com.uservalidation.main.UserRegistration;

public class UserRegistrationTest {
	
	UserRegistration userregistration = new UserRegistration();

	//Test for first name
	@Test
	public void givenFisrtName_WhenProper_ShouldReturnTrue() {
		boolean result = userregistration.validateFirstName("Prateek");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFisrtName_WhenHasThreeLetters_ShouldReturnTrue() {
		boolean result = userregistration.validateFirstName("Leo");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFisrtName_WhenNotProrper_ShouldReturnFalse() {
		boolean result = userregistration.validateFirstName("prateek");
		Assert.assertFalse(result);
	}
	
	//Test for last name
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userregistration.validateFirstName("Patil");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenHasThreeLetters_ShouldReturnTrue() {
		boolean result = userregistration.validateFirstName("Mac");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenNotProrper_ShouldReturnFalse() {
		boolean result = userregistration.validateFirstName("patil");
		Assert.assertFalse(result);
	}
	
	//Test for email address
	@Test
	public void givenEmail1_WhenProper_ShouldReturnTrue() {
		boolean result = userregistration.validateEmailAddress("abc@yahoo.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail2_WhenProper_ShouldReturnTrue() {
		boolean result = userregistration.validateEmailAddress("abc-100@yahoo.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
		boolean result = userregistration.validateEmailAddress("abc@gmail.com.aa.au");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
		boolean result = userregistration.validateEmailAddress("abc@abc@yahoo.com.1a");
		Assert.assertFalse(result);
	}
	
	//Test for phone number
	@Test
	public void givenPhoneNumber1_WhenProper_ShouldReturnTrue() {
		boolean result = userregistration.validatePhoneNumber("91 8974512356");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPhoneNumber2_WhenProper_ShouldReturnTrue() {
		boolean result = userregistration.validatePhoneNumber("+91 8974512356");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPhoneNumber3_WhenNotProper_ShouldReturnFalse() {
		boolean result = userregistration.validatePhoneNumber("91 1974512356");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNumber4_WhenNotProper_ShouldReturnFalse() {
		boolean result = userregistration.validatePhoneNumber("8974512356");
		Assert.assertFalse(result);
	}
	
	//Test for password
	@Test
	public void givenPassword1_WhenProper_ShouldReturnTrue() {
		boolean result = userregistration.validatePassword("9@puryPL4");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword2_WhenProper_ShouldReturnTrue() {
		boolean result = userregistration.validatePassword("Yh7KL45$k@");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword3_WhenProper_ShouldReturnFalse() {
		boolean result = userregistration.validatePassword("Yh7KL45pk5");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenHappy_WhenAnalyseMood_ThenShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		Assert.assertTrue(user.moodAnalyser("Happy"));
	}
	
	@Test
	public void givenSad_WhenAnalyseMood_ThenShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		Assert.assertFalse(user.moodAnalyser("Sad"));
	}
}
