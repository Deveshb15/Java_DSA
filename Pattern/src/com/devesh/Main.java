package com.devesh;

public class Main {

    public static void main(String[] args) {
	    pattern11(4);
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

    public static void pattern7(int n) {
    //          1
    //        2 1 2
    //      3 2 1 2 3
    //    4 3 2 1 2 3 4
    //      3 2 1 2 3
    //        2 1 2
    //          1
        for (int row = 1; row <= 2*n; row++) {
            int totalCols = row > n ? 2*n-row : row;
            int noOfSpaces = n-totalCols;

            for (int space = 1; space <= noOfSpaces; space++) {
                System.out.print("  ");
            }
            for (int col = totalCols; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalCols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
    //    1
    //    2  3
    //    4  5  6
    //    7  8  9  10
    //    11 12 13 14 15
        int num=1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
    //    1
    //    0 1
    //    1 0 1
    //    0 1 0 1
    //    1 0 1 0 1
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if((row+col)%2==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
    //            1               nCr => row(C)col => n!/(n-r)!*r!
    //          1   1
    //        1   2   1
    //      1   3   3   1
    //    1   4   6   4   1
        int ans=0;
        for (int row = 0; row <= n; row++) {
            for (int space = 0; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row; col++) {
                ans = fact(row)/(fact(row-col)*fact(col));
                System.out.print("  " + ans + " ");
            }
            System.out.println();
        }
    }
    static int fact(int i) {
        if (i == 0)
            return 1;
        return i * fact(i - 1);
    }

    public static void pattern11(int n) {
    //    4 4 4 4 4 4 4
    //    4 3 3 3 3 3 4
    //    4 3 2 2 2 3 4
    //    4 3 2 1 2 3 4
    //    4 3 2 2 2 3 4
    //    4 3 3 3 3 3 4
    //    4 4 4 4 4 4 4
        int originalN = n;
        n = 2*n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row-1, col-1), Math.min(n-row-1 , n-col-1));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}


