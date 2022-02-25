package com.uddhav;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.print("Enter number to check prime or not ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num == 1){
            System.out.println("Not Prime");
            return;
        }
        int a = 2;
        while(a*a<=num){
            if(num%a==0){
                System.out.println("Not Prime");
                return;
            }
            System.out.println(a);
            a++;
        }
        System.out.println("Prime");
    }
}
