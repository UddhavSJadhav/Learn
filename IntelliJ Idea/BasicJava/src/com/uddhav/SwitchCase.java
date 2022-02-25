package com.uddhav;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter a week day in numerical ");
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt();
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter Valid Number!!!");
        }
        switch(num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WeekDay");
                break;
            case 6:
            case 7:
                System.out.println("WeekEnd");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
    }
}
