package com.uddhav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

////find duplicate and missing number in an array of 1 to n
//here 3 is dupli and 6 is missing.
public class QueSetMisMatch {
    public static void main(String[] args) {
        int[] arr = {4,5,3,3,2,1,7,8};
        int[] ans = findAllDuplicates(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findAllDuplicates(int[] arr){
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                return new int[] {arr[i], i + 1};
            }
        }
        return new int[] {-1,-1};
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;//actual index of value currently holding that index;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
