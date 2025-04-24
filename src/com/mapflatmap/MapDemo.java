package com.mapflatmap;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //multiply by 2 all values

        List<Integer> updatedList = list.stream().map(v->v*2).toList();

        updatedList.forEach(System.out::println);
    }
}
