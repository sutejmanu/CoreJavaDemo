package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSorting {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ravi","kumar","vasu","dakshith","aruna","sutej","manu");
        List<String> list = Arrays.asList("ravi","kumar","vasu","dakshith","aruna","sutej","manu");
        System.out.println(names);
        System.out.println("Natural Sorting Order");
        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        System.out.println("----------------");
        System.out.println(list);
        System.out.println("Reverse Sorting Order");
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
