package com.collections.streams;

import java.util.Map;
import java.util.stream.Collectors;

public class CharOccuranceInString {
    public static void main(String[] args) {

        String string = "Ravikumar Lakkakula";

        Map<Character, Long> collect = string.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(v -> v, Collectors.counting()));

        collect.forEach((k,v)-> System.out.println(k+"---"+v));
    }
}
