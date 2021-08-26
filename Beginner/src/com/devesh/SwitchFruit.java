package com.devesh;

import java.util.Scanner;

public class SwitchFruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Litchi" -> System.out.println("Devesh's fav fruit");
            case "Apple" -> System.out.println("Sweet fruit");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Enter a valid fruit!");
        }

    }
}
