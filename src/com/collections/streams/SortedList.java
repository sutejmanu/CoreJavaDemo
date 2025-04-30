package com.collections.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ravi","vasu","raju","prasanth","vasantha","dakshith","danvith");


//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println(list.stream().map(x->x.charAt(0)).collect(Collectors.toSet()));
    }
}
