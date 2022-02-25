package com.uddhav;
//Find peak in mountain array.
//[0,1,2,3,2,0] it increases and then decreases; peak is the top or greatest number.
public class QueMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,6,5,3,1,0};
        System.out.println(findPeak(arr));
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;//here mid is less so we ignore it.
            } else if(arr[mid] > arr[mid + 1]){
                end = mid;//here mid is greater and might be the ans, so we take it too.
            }
        }
        //at loop break start and end will have same value, the greatest number.
        return arr[start];
    }
}
