package com.core;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNoNRepetiveCharInString2 {
    public static void main(String[] args) {
        String str = "my name is ravikumar";
        char result = findFirstNonRepeatedChar(str);
        System.out.println("First non-repeated character is: " + result);
    }

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Populate the LinkedHashMap with character counts
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; // or another indicator for no non-repeated character
    }
}
