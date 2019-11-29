package com.hemanthsavasere.recursion;

import java.math.BigInteger;

public class SumOfArrayElements {
    public static BigInteger recursiveSum(int[] arr,  int k) {
        if (k == 1)
            return BigInteger.valueOf(arr[0]);
        else
            return BigInteger.valueOf(arr[k-1]).add(recursiveSum(arr, k-1));
    }

    public static void main(String[] args) {
        System.out.println(recursiveSum(new int[]{1, 2, 3, 4}, 4));
    }
}
