/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayesh
 */
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
