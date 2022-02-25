package com.uddhav;

public class QueFirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {4,2,0,1};
        cyclicSort(arr);
        int ans = checkPosi(arr);
        System.out.println(ans);
    }
    static int checkPosi(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                return i + 1;
            }
        }
        //returning arr.length coz only number missing will be Nth number
        return arr.length + 1;
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] != arr[correct] && arr[i] <= arr.length){
                swap(arr,i,correct);
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
