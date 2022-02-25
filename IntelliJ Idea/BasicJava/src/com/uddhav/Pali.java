package com.uddhav;

import java.util.Scanner;

public class Pali {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 2;i<=num;i++){
            int temp = b;
            b += a;
            a = temp;
        }
        System.out.println(b);
    }
}
