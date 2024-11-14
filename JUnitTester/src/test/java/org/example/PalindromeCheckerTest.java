package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void isPalindrome() {
        assertEquals(true, PalindromeChecker.isPalindrome("aba"));
        assertEquals(true, PalindromeChecker.isPalindrome("racecar"));
        assertEquals(false, PalindromeChecker.isPalindrome("man"));
        assertEquals(true, PalindromeChecker.isPalindrome("a"));
        assertEquals(false, PalindromeChecker.isPalindrome("run"));
    }

}