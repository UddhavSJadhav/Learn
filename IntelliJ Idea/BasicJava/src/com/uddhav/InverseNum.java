package com.uddhav;

import java.util.Scanner;

public class InverseNum {
    public static void main(String[] args) {
        System.out.println("Enter a number to inverse");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = 0;
        while(num>0){
            n = n*10 + num % 10;
            num /= 10;
        }
        System.out.println("Inverse of number is "+n);
    }
}
