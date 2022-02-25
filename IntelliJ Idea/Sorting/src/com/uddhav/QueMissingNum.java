package com.uddhav;
//Find Missing number from 0 to N;
import java.util.Arrays;

public class QueMissingNum {
    public static void main(String[] args) {
        int[] arr = {4,2,0,1};
        cyclicSort(arr);
        int ans = checkPosi(arr);
        System.out.println(ans);
    }
    static int checkPosi(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                return i;
            }
        }
        //returning arr.length coz only number missing will be Nth number
        return arr.length;
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i && arr[i] < arr.length){
                swap(arr,i,arr[i]);
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
