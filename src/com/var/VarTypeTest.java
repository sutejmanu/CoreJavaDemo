package com.var;

import java.util.ArrayList;

public class VarTypeTest {
    public static void main(String[] args) {

        var name  = "ravikumar";

        var num  = 10;

        var list = new ArrayList<>();
        System.out.println(list.getClass());
        System.out.println(name.getClass());
        System.out.println(num);
    }
}
