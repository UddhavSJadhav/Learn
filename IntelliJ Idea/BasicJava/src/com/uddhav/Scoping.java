package com.uddhav;
//primitive does not change but non-primitive changes
public class Scoping {
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = 20;
        int[] c = {1,2,3,4,5,6,7};
        sum(a,b);
        change(c);
        System.out.println(a); //No change
        System.out.println(c[0]); //change
    }

    static void sum(int a, int b){
        a+=b;
        System.out.println(a); //Change
    }

    static void change(int[] a){
        a[0] = 99;
        System.out.println(a[0]); //change
    }
}
