package com.arrays;

import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String name1 = "listen";
        String name2 = "silent";

        if(getSortedString(name1).equals(getSortedString(name2)))
            System.out.println("Given names are Anagrams - True");
        else
            System.out.println("Given names are not Anagrams - False");

    }
    public static String getSortedString(String name){
        String sortedString = name.chars().mapToObj(ch -> String.valueOf((char) ch)).sorted()
                .collect(Collectors.joining());
        return sortedString;
    }
}
