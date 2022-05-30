package com.uddhav;
//Outer for loop will run row times.
//inner loop will run for col times.
//Then get what you to print
//Note: Find the sequence formula for pattern to print
public class PatternsInJava {
    public static void main(String[] args) {
        Pattern10(4);
    }
    static void Pattern1(int n){
        //****
        //****
        //****
        //****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern2(int n){
        //*
        //**
        //***
        //****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern3(int n){
        //****
        //***
        //**
        //*
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i ; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //OR
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        //1
        //12
        //123
        //1234
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    static void Pattern5(int n){
        //*
        //**
        //***
        //****
        //***
        //**
        //*
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRows = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern6(int n){
        //   *
        //  * *
        // * * *
        //* * * *
        // * * *
        //  * *
        //   *
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRows = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRows;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern7(int n){
        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        for (int row = 1; row <= n ; row++) {
            int noOfSpaces = n - row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row * 2 - 1; col++) {
                int noToPrint = col <= row ? row - col + 1 : col - row + 1;
                System.out.print(noToPrint + " ");
            }
            System.out.println();
        }
        //OR
        for (int row = 1; row <= n ; row++) {
            int noOfSpaces = n - row;
            for (int i = 0; i < noOfSpaces; i++) {
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
    static void Pattern8(int n){
        //    1
        //   212
        //  32123
        // 4321234
        //  32123
        //   212
        //    1
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfCols = row > n ? 2 * n - row : row;
            int noOfSpaces = n - noOfCols;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }
            for (int col = noOfCols; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= noOfCols; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void Pattern9(int n){
        //4444444
        //4333334
        //4322234
        //4321234
        //4322234
        //4333334
        //4444444
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                int toPrint = n -  Math.min(Math.min(row,col),Math.min(2 * n-row,2 * n - col)) + 1;
                System.out.print(toPrint + " ");
            }
            System.out.println();
        }
    }
    static void Pattern10(int n){
        //*     *
        //**   **
        //*** ***
        //*******
        //*** ***
        //**   **
        //*     *
        for (int row = 1; row < 2 * n; row++) {
            int noOfStars1 = row <= n ? row : 2 * n - row;
            for (int col = 0; col < noOfStars1; col++) {
                System.out.print("*");
            }
            int noOfSpaces = row <= n ? (2 * n - 1) - 2 * row : 2 * n - 1 - 2 * (2 * n - row);
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            int noOfStars2 = row < n ? row : row == n ? n - 1 : 2 * n - row;
            for (int col = 0; col < noOfStars2; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
