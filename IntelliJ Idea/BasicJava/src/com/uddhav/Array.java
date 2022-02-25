package com.uddhav;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[5];
        a = new int[]{1, 2, 3, 4, 5};
        //forEach
        for(int ele : a){
            System.out.print(ele+" ");
        }
        System.out.println();
        //or
        System.out.println(Arrays.toString(a));

        //swap
        swap(a,0,3);

        reverse(a);

        int[][] b = new int[3][];
        int[][] c = {{1,2,3},{4,5},{6,7,8,9}};
        //double for loop
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void swap(int[] a, int index1, int index2){
        int temp = a[index2];
        a[index2] = a[index1];
        a[index1] = temp;
    }

    static void maxVal(int[] a){
        int maxV = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>maxV){
                maxV = a[i];
            }
        }
        System.out.println("Maximum value is "+maxV);
    }

    static void maxRange(int[] a, int start,int end){
        int maxV = a[start];
        for (int i = 1; i <= end; i++) {
            if(a[i]>maxV){
                maxV = a[i];
            }
        }
        System.out.println("Maximum value is "+maxV);
    }

    static void reverse(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
        System.out.println("Reverse is "+ Arrays.toString(a));
    }
}
