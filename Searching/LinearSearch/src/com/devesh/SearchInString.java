package com.devesh;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Devesh";
        char target = 'e';
        System.out.println(searchInString2(name, target));
    }

    static boolean searchInString(String str, char target) {
        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

//  Enhanced for loop
    static boolean searchInString2(String str, char target) {
        if(str.length() == 0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
