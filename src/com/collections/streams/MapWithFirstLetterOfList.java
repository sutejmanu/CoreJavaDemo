package com.collections.streams;

import java.util.*;
import java.util.stream.Collectors;

public class MapWithFirstLetterOfList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ravi","vasu","raju","prasanth","vasantha","dakshith","danvith");

        Map<String, List<String>> map = new HashMap<>();

        for(String name : list){
            String firstChar = String.valueOf(name.charAt(0));
            if(map.get(firstChar) == null)
                map.put(firstChar, new ArrayList<>(List.of(name)));
            else{
                 map.get(firstChar).add(name);
            }
        }

        System.out.println(map);

        System.out.println("Using Java8-------------------------");
        System.out.println("------------------------------------");

        HashMap<Character, List<String>> collect = list.stream().collect(Collectors.toMap(x -> x.charAt(0), x -> list.stream()
                        .filter(y -> y.startsWith(String.valueOf(x.charAt(0)))).toList(),
                (old, neww) -> old, HashMap::new));
        
        collect.forEach((k,v)-> System.out.println(k+"---"+v));

        System.out.println("names with length map");
        Map<String, Integer> collect1 = list.stream().collect(Collectors.toMap(word -> word, word -> word.length()));

        collect1.forEach((k,v)-> System.out.println(k+"---"+v));
    }
}
