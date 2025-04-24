package com.collections.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {

        //adding sum of numbers
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,2);

        System.out.println("Way 1---:"+list.stream().reduce(0,(a,b)-> a+b));
        System.out.println("Way 2---:"+list.stream().reduce(0,Integer::sum));
        System.out.println("Min ---:"+list.stream().reduce(Integer::min).get());
        System.out.println("Max ---:"+list.stream().reduce(Integer::max).get());

        System.out.println("Sorted forward----:"+list.stream().sorted().toList());
        System.out.println("Sorted reverse----:"+list.stream().sorted(Comparator.reverseOrder()).toList());

    }
}
