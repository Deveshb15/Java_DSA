package com.devesh;

public class Main {

    public static void main(String[] args) {
        String s = "abba";

        int ans = pal(s, 1, 2);
        System.out.println(ans);
    }

    public static int pal(String s, int left, int right) {
        if(s == null || left > right) return  0;

        while(s.charAt(left) == s.charAt(right) && left > 0 && right < s.length()) {
            left--;
            right++;
        }

        return right-left-1;
    }
}
