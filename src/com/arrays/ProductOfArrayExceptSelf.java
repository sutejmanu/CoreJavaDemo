package com.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }

    static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] intArr = new int[n];
        Arrays.fill(intArr, 1);

        System.out.println("Array completely filled with 10: " + Arrays.toString(intArr));

        for(int i = 0; i< n; i++){

            for(int j = 0; j< n; j++){
                if(i != j)
                    intArr[i] = intArr[i] * arr[j];
            }
        }

        return intArr;
    }
}
