package com.uddhav;
//this is function overloading using same function name with different or no parameters
public class Overloading {
    public static void main(String[] args) {
        sum(1,2);
        sum(3,4,5);
    }

    static void sum(int a,int b){
        System.out.println(a+b);
    }

    static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
