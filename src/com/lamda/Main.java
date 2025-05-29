package com.lamda;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a,b)->(a+b) ;
        System.out.println(add.add(10,20));

    }
}
