package com.devesh;

public class Palindrome {
    public static void main(String[] args) {
        int num = 3425243;
        int temp = num;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }

        if(temp == rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("No");
        }
    }
}
