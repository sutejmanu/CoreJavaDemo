package com.core;

public class Factorial {
    public static void main(String[] args) {

        int value = 3;
        int result = 1;

        for(int i =1; i <= value ; i++)
            result *= i;

        System.out.println(result);
    }
}
