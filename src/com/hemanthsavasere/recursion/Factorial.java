package com.hemanthsavasere.recursion;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger recursiveFactorial(int n){
        BigInteger fact = new BigInteger("1");
        if(n == 0 || n == 1)
            return fact;
        else
            return BigInteger.valueOf(n).multiply(recursiveFactorial(n-1));
    }
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(100));
    }
}
