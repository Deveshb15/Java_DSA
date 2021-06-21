package Recursion;

public class easySums {
    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(fibo(9));
    }

    public static int factorial(int n){
        if(n==0 || n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
