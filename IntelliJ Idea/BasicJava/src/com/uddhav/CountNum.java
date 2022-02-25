package com.uddhav;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Enter digit to find its occurrence");
        int n = in.nextInt();
        int count = 0;
        while(num>0){
            int a = num % 10;
            num /= 10;
            if(a==n){
                count++;
            }
        }
        System.out.println("Number of occurrence of "+n+" is "+count);
    }
}
