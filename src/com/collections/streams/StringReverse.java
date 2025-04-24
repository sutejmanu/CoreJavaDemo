package com.collections.streams;

public class StringReverse {
    public static void main(String[] args) {
        String string = "Ravikumar Lakkakula";

        System.out.println(string.chars().mapToObj(ch->String.valueOf((char)ch)).reduce((a, b)->b+a).orElse(""));
    }
}
