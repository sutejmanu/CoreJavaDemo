package com.core;

import java.util.Arrays;
import java.util.List;

public class MissingNumberInSequence {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9);

        int sum = (9 * (9+1)) /2;
        int actualSum = list.stream().reduce(0,Integer::sum);
        System.out.println("Missing Number---:"+(sum-actualSum));

        List<Integer> numList = Arrays.asList(1,2,3,4,6,8,9);

        for(int i = 1; i< 10; i++){
            if(!numList.contains(i))
                System.out.println("Missing Number--"+i);
        }
    }
}
