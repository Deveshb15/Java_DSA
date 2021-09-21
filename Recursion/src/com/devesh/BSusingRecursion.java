package com.devesh;

public class BSusingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 7, 8, 11, 15};
        int start = 0;
        int end = arr.length-1;

        System.out.println(search(arr, 2, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int start, int end) {

        int mid = start + (end-start)/2;

        if(start > end) {
            return -1;
        }
        if(arr[mid]==target) {
            return mid;
        }

        if(arr[mid] > target){
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}
