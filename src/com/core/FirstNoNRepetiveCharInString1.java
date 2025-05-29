package com.core;

public class FirstNoNRepetiveCharInString1 {
    public static void main(String[] args) {
        String str = "my name is yravikumar";
        char result = findFirstNonRepeatedChar(str);
        System.out.println("First non-repeated character is: " + result);
    }

    public static char findFirstNonRepeatedChar(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Populate the frequency array
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0'; // or another indicator for no non-repeated character
    }
}
