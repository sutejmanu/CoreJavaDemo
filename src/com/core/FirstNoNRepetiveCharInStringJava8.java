package com.core;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNoNRepetiveCharInStringJava8 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> multiplyList = new ArrayList<>();
        for(int i = 0; i < list.size() ; i++){
           // multiplyList.add(list.stream().filter().reduce((a, b)->a*b).get()) ;
        }


        System.out.println("Multiply of all values: " + multiplyList);


    }
}
