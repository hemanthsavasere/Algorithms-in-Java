package recursion;

import java.math.BigInteger;

public class Fibonacci {
    public static BigInteger recursiveFibonacci(int n) {
        if (n == 0)
            return BigInteger.valueOf(0);
        else if (n == 1)
            return BigInteger.valueOf(1);
        else
            return recursiveFibonacci(n - 1).add(recursiveFibonacci(n - 2));
    }

    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(0));
        System.out.println(recursiveFibonacci(1));
        System.out.println(recursiveFibonacci(10));
    }
}
