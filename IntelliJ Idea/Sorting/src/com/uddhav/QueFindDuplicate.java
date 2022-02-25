package com.uddhav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueFindDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,5,3,3,2,1,7,};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
    static int findDuplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
