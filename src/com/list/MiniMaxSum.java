package com.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {

        //List<Integer> list = Arrays.asList(140638725, 436257910, 953274816, 734065819, 362748590);

        //List<Integer> list = Arrays.asList(769082435 ,210437958, 673982045 ,375809214 ,380564127);
        List<Integer> list = Arrays.asList(396285104 ,573261094 ,759641832 ,819230764 ,364801279);

        Integer maxSum = list.stream().skip(1).reduce(Integer::sum).orElse(0);
        Collections.reverse(list);
        Integer minSum = list.stream().skip(1).reduce(Integer::sum).orElse(0);
        System.out.print(minSum+" "+maxSum);

    }
}
