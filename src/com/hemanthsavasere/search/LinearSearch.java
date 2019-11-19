package com.hemanthsavasere.search;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 100, 2, 5};
        System.out.println(linearSearch(arr, 100));
        System.out.println(linearSearch(arr, 88));
    }
}
