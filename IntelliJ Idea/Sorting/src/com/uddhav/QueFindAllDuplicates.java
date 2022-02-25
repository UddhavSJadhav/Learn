package com.uddhav;

import java.util.ArrayList;
import java.util.List;

public class QueFindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,5,3,3,2,1,7,7};
        List<Integer> ans = findAllDuplicates(arr);
        System.out.println(ans);
    }
    static List<Integer> findAllDuplicates(int[] arr){
        cyclicSort(arr);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                ans.add(arr[i]);
            }
        }
        return ans;
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
