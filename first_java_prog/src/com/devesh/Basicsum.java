package com.devesh;

import java.util.Scanner;

public class Basicsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 2; i < n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }

    }
}
