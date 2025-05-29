package com.mapflatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3),Arrays.asList(4, 5),Arrays.asList(6, 7, 8));
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(Collection::stream)  // Flattening step
                .toList();

        //Prints [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("Flattened list: " + flattenedList);

        System.out.println("-------");

        System.out.println(listOfLists.stream().flatMap(list->list.stream()).toList());

    }
}
