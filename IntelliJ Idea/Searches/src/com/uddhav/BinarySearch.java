package com.uddhav;

public class BinarySearch {// for sorted array only
    public static void main(String[] args) {
        int[] arr = {-24,-12,0,1,3,6,8,12,34,45,68,89};
        System.out.println(binarySearch(arr,12));
    }

    //return index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            //int mid = (start+end)/2 might give error if start and end are large integers.
            int mid = start+(end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;//this is for ascending order; for descending order start = mid + 1;
            }else if(target > arr[mid]){
                start = mid + 1;//this is for ascending order; for descending order end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
