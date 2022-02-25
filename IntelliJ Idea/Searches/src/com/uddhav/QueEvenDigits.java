package com.uddhav;
//Find how many numbers in array have even numbers of digits.
public class QueEvenDigits {
    public static void main(String[] args) {
        int[] num = {123,23,435,1,1234,365665};
        System.out.println(checkEven(num));
    }
    static boolean even(int a){
        return a%2==0;
    }
    static int getDigits(int a){
        int dig = 0;
        while(a>0){
            a/=10;
            dig++;
        }
        return dig;
    }
    static int checkEven(int[] a){
        int count = 0;
        for (int q: a) {
            if(even(getDigits(q))){
                count++;
            }
        }
        return count;
    }
}
