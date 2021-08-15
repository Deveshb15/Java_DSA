package com.devesh;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // write your code here
        int[] nums = {1, 2, 5, 6, 7, 9, 14};
        int target = 9;
        int ans = orderAgnosticBS(nums, target);
        System.out.println(ans);
    }

    public static int orderAgnosticBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

//        Find if the arr is ascending or descending
        boolean isAsc = nums[start] < nums[end];

        while(start <= end){
//            int mid = (start+end)/2;  //(start+end) will exceed range of int in java
            int mid = start + (end - start) / 2;

            if(target == nums[mid]){
                return mid;
            }

            if(isAsc){
                if(target > nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            } else {
                if(target < nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
