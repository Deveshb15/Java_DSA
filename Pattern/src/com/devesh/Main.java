package com.devesh;

public class Main {

    public static void main(String[] args) {
	    pattern6(5);
    }

    public static void pattern1(int n) {
    //    *
    //    **
    //    ***
    //    ****
    //    *****

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=  row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
    //    *****
    //    ****
    //    ***
    //    **
    //    *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
    //    1
    //    1 2
    //    1 2 3
    //    1 2 3 4
    //    1 2 3 4 5

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
    //    *
    //    **
    //    ***
    //    ****
    //    *****
    //    ****
    //    ***
    //    **
    //    *

        for (int row = 1; row <= 2*n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    //  * * * *
    //   * * *
    //    * *
    //     *
        for (int row = 1; row <= 2*n; row++) {
            int totalCols = row > n ? 2*n-row : row;
            int noOfSpaces = n-totalCols;

            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
    //            1
    //          2 1 2
    //        3 2 1 2 3
    //      4 3 2 1 2 3 4
    //    5 4 3 2 1 2 3 4 5
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}


