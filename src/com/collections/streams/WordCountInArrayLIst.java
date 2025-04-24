package com.collections.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordCountInArrayLIst {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("ravi");
        list.add("ravi");
        list.add("ravi");

        System.out.println(list.size());

        Set<String> set = new HashSet<>(list);

        for(String s: set)
            System.out.println(s+"---:"+ Collections.frequency(list,s));
    }
}
