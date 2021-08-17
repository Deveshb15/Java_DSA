package com.devesh;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] ans = productExceptSelp(nums);

        System.out.println(ans);
    }

    public static int[] productExceptSelp(int[] nums) {
        int[] right = new int[nums.length];
        int prod = 1;
        for (int i = nums.length-1; i >= 0 ; i--) {
            prod *= nums[i];
            right[i] = prod;
        }

        int[] ans = new int[nums.length];
        prod = 1;
        for (int i = 0; i < nums.length-1; i++) {
            int lp = prod;
            ans[i] = lp * right[i+1];
            prod *= nums[i];
        }
        ans[nums.length-1] = prod;

        return ans;
    }
}
