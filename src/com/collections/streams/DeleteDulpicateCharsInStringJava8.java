package com.collections.streams;

import java.util.*;
import java.util.stream.Collectors;

public class DeleteDulpicateCharsInStringJava8 {

    public static void main(String[] args) {

        List<Character> list = Arrays.asList('D', 'e', 'm', 'o');

       // System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining()));
        String str = "geeksforgggeggeks";
        removeDuplicateCharsInString(str);
        StringBuilder sb = new StringBuilder();
        //System.out.println(str.chars().distinct().mapToObj(ch->String.valueOf((char)ch)).collect(Collectors.joining()));
    }

    public static void removeDuplicateCharsInString(String str){

        char[] charArray = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char c: charArray){
            if(!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c)+1);
        }

        System.out.println(map);

        System.out.println("Most Repeted value---:"+map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(Map.Entry::getKey).findFirst().get());
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1)
                System.out.println(entry.getKey()+"------"+entry.getValue());
        }



    }
}
