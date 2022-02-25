package com.uddhav;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,8,4,5,2,1,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //compare element with - 1th element.
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //here arr.length - i because with each step last terms will be sorted and can be ignored
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!swapped){ //loop should break if swap doesn't happen in 1 pass, as the array is already sorted don't continue
                break;
            }
        }
    }
}
