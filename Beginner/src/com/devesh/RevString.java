package com.devesh;

public class RevString {
    public static void main(String[] args) {
        String temp = "devesh";
        char[] ch = temp.toCharArray();
        String rev = "";

        for(int i = temp.length() -1; i>=0; i--){
            rev += ch[i];
        }
        System.out.println(rev);
    }
}
