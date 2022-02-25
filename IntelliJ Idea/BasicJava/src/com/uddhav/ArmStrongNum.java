package com.uddhav;

import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        System.out.println("Enter number check to Armstrong or not ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(check(num));
        all3digits();
    }

    static void all3digits(){
        for(int i = 100; i<1000;i++){
            if(check(i)){
                System.out.println(i);
            }
        }
    }

    static boolean check(int num){
        int original = num;
        int sum = 0;
        while (num>0){
            sum += (num%10)*(num%10)*(num%10);
            num /= 10;
        }
        return original==sum;
    }
}
