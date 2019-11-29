package com.hemanthsavasere.recursion;

public class TowerOfHanoi {
    public static void transfer(int n, String source, String temp, String destination) {
        if (n == 0)
            return;
        else {
            transfer(n - 1, source, destination, temp);
            System.out.println("Transferring disk " + n + " from " + source + " to " + destination);
            transfer(n - 1, temp, source, destination);
        }
    }

    public static void main(String[] args) {
        transfer(3, "A", "B", "C");
    }
}
