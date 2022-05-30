package com.uddhav;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibo(6));
    }
    static int Fibo(int n){
        //return 0 and 1 if fibonacci of 0 and 1 is to returned
        if(n < 2){
            return n;
        }
        return Fibo(n-1) + Fibo( n-2);
    }
}
