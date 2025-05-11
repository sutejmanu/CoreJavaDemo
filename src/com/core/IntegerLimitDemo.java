package com.core;

public class IntegerLimitDemo {
    public static void main(String[] args) {

        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println("i1 and i2 are ---:"+ (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i3 and i4 are ---:"+ (i3 == i4));

    }
}
