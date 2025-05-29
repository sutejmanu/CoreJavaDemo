package com.core;

public class FirstNoNRepetiveCharInString {
    public static void main(String[] args) {
        String str = "my name is ravikumar";
        char result = findFirstNonRepeatedChar(str);
        System.out.println("First non-repeated character is: " + result);
    }

    public static char findFirstNonRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return str.charAt(i);
            }
        }
        return '\0'; // or another indicator for no non-repeated character
    }
}
