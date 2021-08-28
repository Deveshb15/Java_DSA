package com.devesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {5, 3, 4, 1, 2};
	    insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int small, int big) {
        int temp = arr[small];
        arr[small] = arr[big];
        arr[big] = temp;
    }
}
