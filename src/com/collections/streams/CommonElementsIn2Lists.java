package com.collections.streams;

import java.util.Arrays;
import java.util.List;

public class CommonElementsIn2Lists {
    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(10,20,30,50,70);
        List<Integer> input2 = Arrays.asList(11,22,30,51,70);

        System.out.println(input1.stream().filter(input2::contains).distinct().toList());
    }
}
