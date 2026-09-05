package com.university.lab.helloworld.lab3;

public class StringUtil {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        // Remove non-alphabetic characters and convert to lowercase
        String clean = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        
        // Return false for empty cleaned strings
        if (clean.isEmpty()) {
            return false;
        }
        
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }
}
