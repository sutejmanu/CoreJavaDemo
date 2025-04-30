package com.collections.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HighestLengthStringInWords {
    public static void main(String[] args) {
        String word = "my name is ravikumarrr lakkakula";


        Stream<String> stream = Arrays.stream(word.split(" "));
        String string = stream.max(Comparator.comparing(String::length)).orElse("");
        System.out.println(string);
    }
}
