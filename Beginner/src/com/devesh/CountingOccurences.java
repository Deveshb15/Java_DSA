package com.devesh;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 137567;
        int count = 0;

        while(n > 0){
            int rem = n%10;
            if(rem == 7){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
