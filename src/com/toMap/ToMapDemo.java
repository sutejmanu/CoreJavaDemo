package com.toMap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "John", 25));
        students.add(new Student(2L, "Evans", 33));
        students.add(new Student(3L, "Chris", 19));
        students.add(new Student(4L, "Jennifer", 25));
        students.add(new Student(5L, "Mitch", 29));
        students.add(new Student(6L, "Evans", 25));


        List<String> list = Arrays.asList("apple", "banana", "apple" , "cherry");

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        String::length,
                        (existing, replacement) -> existing,
                        TreeMap::new));

        System.out.println(map);

        Map<Long, String> collect = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));

        for(Map.Entry<Long, String> entrySet: collect.entrySet()){
            System.out.println(entrySet.getKey()+"-----"+entrySet.getValue());
        }

        Map<String, Student> nameToStudent = students.stream()
                .collect(Collectors.toMap(Student::getName, Function.identity(), (oldStudent,newStudent)->oldStudent,TreeMap::new));
        System.out.println("-----------");
        System.out.println(nameToStudent);
    }
}
