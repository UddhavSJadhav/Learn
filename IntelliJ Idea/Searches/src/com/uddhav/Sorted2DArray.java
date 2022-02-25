package com.uddhav;

import java.util.Arrays;

public class Sorted2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] ans = search2DArray(matrix,10);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarySearch(int[][] matrix, int target,int row, int colStart,int colEnd){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            } else if(matrix[row][mid] < target){
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return binarySearch(matrix,target,0,0,cols - 1);
        }
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;
        //run the loop till 2 rows are remaining
        while (rowStart < (rowEnd - 1)){
            int mid = rowStart + (rowEnd - rowStart)/2;
            if(matrix[mid][colMid] == target){
                return new int[] {mid,colMid};
            }
            if(matrix[mid][colMid] < target){
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }
        // now we have 2 rows
        //check whether the answer is in middle col of 2 rows
        if(matrix[rowStart][colMid] == target){
            return new int[] {rowStart,colMid};
        }else if(matrix[rowStart +1][colMid] == target){
            return new int[] {rowStart+1,colMid};
        }
        //search in 1st quarter
        if(target <= matrix[rowStart][colMid - 1]){
            return binarySearch(matrix,target,rowStart,0,colMid - 1);
        }
        //search in 2nd quarter
        if(target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]){
            return binarySearch(matrix,target,rowStart,colMid + 1,cols - 1);
        }
        //search in 3rd quarter
        if(target <= matrix[rowStart + 1][colMid - 1]){
            return binarySearch(matrix,target,rowStart + 1,0,colMid - 1);
        }
        //search in 4th quarter
        if(target >= matrix[rowStart + 1][colMid + 1]){
            return binarySearch(matrix,target,rowStart + 1,colMid + 1,cols - 1);
        }
        return new int[] {-1,-1};
    }
}
