package com.devesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2, 5, 6, 7, 9, 14};
        int target = 9;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
//            int mid = (start+end)/2;  //(start+end) will exceed range of int in java
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
