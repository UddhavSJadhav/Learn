package com.uddhav;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Kunal's Version
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int findMaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = start + 1; i < end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //My Version
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //here arr.length - i because with each step last terms will be sorted and can be ignored
            int maxIndex = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
