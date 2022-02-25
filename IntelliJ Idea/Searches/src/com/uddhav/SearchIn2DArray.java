package com.uddhav;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {1,3,4,5,6},
                {34,56,78,22},
                {324,76,43,32}
        };
        System.out.println(Arrays.toString(search(a,78)));
        minMax(a);
    }

    static int[] search(int[][] a,int target){
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if(a[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static void minMax(int[][] a){
        int min = Integer.MAX_VALUE;
        for (int[] p: a) {
            for (int q: p) {
                if(q<min){
                    min=q;
                }
            }
        }
        System.out.println("min value is "+min);
        int max = Integer.MIN_VALUE;
        for (int[] p: a) {
            for (int q: p) {
                if(q>max){
                    max=q;
                }
            }
        }
        System.out.println("max value is "+max);
    }
}
