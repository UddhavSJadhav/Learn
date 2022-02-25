package com.uddhav;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RowColMatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,10},
                          {2,5,8,11},
                          {3,6,9,12}};
        int ans[] = rowColBS(matrix, 9);
        System.out.println(Arrays.toString(ans));
    }
    static int[] rowColBS(int[][] matrix,int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[] {r,c};
            }
            if(matrix[r][c] < target){
                r++;
            } else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
