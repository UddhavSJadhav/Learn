package com.uddhav;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,4,5,2,1,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //compare element with - 1th element.
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {//note its  < arr.length - 1
            //here arr.length - i because with each step last terms will be sorted and can be ignored
            for (int j = i + 1; j > 0; j--) {
                 if(arr[j] < arr[j-1]){
                     swap(arr,j,j-1);
                 }else{
                     break;
                 }
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
