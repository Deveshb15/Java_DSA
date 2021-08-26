package com.devesh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        if(num <= 1){
            System.out.println("Neither Prime nor composite");
            return;
        }

        int c = 2;
        if(num == 4){
            System.out.println("Not Prime");
        }
        else {
            while (c * c <= num) {
                if (num % c == 0) {
                    System.out.println("Not Prime");
                    return;
                }
                c = c + 1;
                // c++;
            }
            if (c * c > num) {
                System.out.println("Prime");
            }
        }
    }
}
