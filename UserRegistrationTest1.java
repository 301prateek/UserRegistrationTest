package com.uservalidation.test;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.uservalidation.main.UserRegistration;

import org.junit.Test;

@RunWith(Parameterized.class)
public class UserRegistrationTest1 {

    private String email;
    private boolean expectedResult;
    private UserRegistration userregistration;
    
    public UserRegistrationTest1(String email, boolean expectedResult)
    {
        this.email=email;
        this.expectedResult=expectedResult;
    }
    
    @Before
    public void initialize()
    {
        userregistration = new UserRegistration();
    }
    
    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][] {
            {"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},
            {"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},
            {"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
            {"abc@.com.my",false},{"abc123@gmail.a",false},{"abc123@.com",false},
            {".abc@abc.com",false},{"abc()*@gmail.com",false},{"abc@%*.com",false},
            {"abc..2002@gmail.com",false},{"abc@abc@gmail.com",false},{"abc@gmail.com.1a",false},
            {"abc@gmail.com.aa.au",false}
        });
    }

    @Test
    public void userRegistrationTest() {
      assertEquals(expectedResult,userregistration.validateEmailAddress(email));
    }
}