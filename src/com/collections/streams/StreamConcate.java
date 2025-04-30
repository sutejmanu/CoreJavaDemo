package com.collections.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcate {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,3,0,-1,0,-6,6,0,-7,9,8);

       List<Integer> concat = Stream.concat(list.stream().filter(n -> n > 0), Stream.concat(list.stream().filter(n -> n == 0),
               list.stream().filter(n->n<0)) ).toList();
        System.out.println(concat);

    }
}
