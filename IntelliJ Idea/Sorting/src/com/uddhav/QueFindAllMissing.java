package com.uddhav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//find all missing elements from 1 to N.
public class QueFindAllMissing {
    public static void main(String[] args) {
        int[] arr = {4,5,3,3,2,1,7,7};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        List ans = missingNums(arr);
        System.out.println(ans);
    }
    static List<Integer> missingNums(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                ans.add(i + 1);
            }
        }
        return ans;
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
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
