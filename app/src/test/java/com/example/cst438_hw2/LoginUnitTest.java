package com.example.cst438_hw2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUnitTest {
    @Test
    public void testPassUserVerification() {
        assertEquals(true, Login.usernameVerification("Sumagang427"));
    }
    @Test
    public void testFailUserVerification() {
        assertEquals(false, Login.usernameVerification("scoopitypoop"));
    }
    @Test
    public void testPassPasswordVerification() {
        assertEquals(true, Login.passwordVerification("guhhh"));
    }
    @Test
    public void testFailPasswordVerification() {
        assertEquals(false, Login.passwordVerification("password"));
    }
}