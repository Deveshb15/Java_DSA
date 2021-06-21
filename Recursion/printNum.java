package Recursion;

public class printNum {
    public static void main(String[] args) {
        printDec(10);
    }

    public static void printInc(int n){
        if(n == 0){
            return;
        }

        printInc(n-1);
        System.out.println(n);
    }

    public static void printDec(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        printDec(n-1);
    }
}
