package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseLIst {
    public static void main(String[] args) {

            // create an empty list to reverse
            List<String> list = new ArrayList<>();
            // add elements
            list.add("Google");
            list.add("Facebook");
            list.add("Youtube");
            list.add("Whatsapp");
            list.add("Instagram");
            System.out.println("Before reversing...");
            System.out.println(list);
            // create empty list
            List<String> rList = new ArrayList<>();
            list.stream().collect(Collectors.toCollection(LinkedList:: new)).
                    descendingIterator().forEachRemaining(rList :: add);
            System.out.println("After reversing...");
            System.out.println(rList);

    }
}
