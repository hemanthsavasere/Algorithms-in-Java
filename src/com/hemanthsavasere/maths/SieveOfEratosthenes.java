package com.hemanthsavasere.maths;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static List<Integer> sieve(int n) {
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i < n + 1; i++) {
            arr[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                int j = i * 2;
                while (j <= n) {
                    arr[j] = false;
                    j += i;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(sieve(10));
    }
}
