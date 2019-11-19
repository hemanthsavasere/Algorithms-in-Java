package com.hemanthsavasere.search;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == arr[mid])
                return mid;

            else if (key > arr[mid])
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;

        if (low > high)
            return -1;

        else if (key == arr[mid])
            return mid;

        else if (key > arr[mid])
            return binarySearchRecursive(arr, mid + 1, high, key);

        else
            return binarySearchRecursive(arr, low, mid - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 50, 100};
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 100));
        System.out.println(binarySearch(arr, 99));
        System.out.println(binarySearchRecursive(arr, 0, arr.length, 1));
        System.out.println(binarySearchRecursive(arr, 0, arr.length, 50));
        System.out.println(binarySearchRecursive(arr, 0, arr.length, 100));
        System.out.println(binarySearchRecursive(arr, 0, arr.length, 98));



    }
}
