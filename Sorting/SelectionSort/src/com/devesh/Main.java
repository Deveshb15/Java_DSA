package com.devesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = getMaxNumber(arr, 0, last);
            swap(arr, max, last);
        }
    }

    public static int getMaxNumber(int[] arr, int start, int last) {
        int max = start;
        for(int i = start; i <= last; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
