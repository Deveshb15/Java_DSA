package com.devesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {3, 5, 6, 1, 2, 8};

        System.out.println(linearSearch2(arr, 99));
    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return  -1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return  -1;
    }

//    Enhanced for loop and return element instead of index
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for(int element: arr) {
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
