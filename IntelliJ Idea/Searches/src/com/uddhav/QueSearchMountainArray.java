package com.uddhav;

public class QueSearchMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,6,5,3,1,0};
        int target = 6;
        System.out.println(searchMountain(arr,target));
    }
    static int searchMountain(int[] arr, int target){
        int peak = findPeak(arr);// index of the greatest number
        if(target == arr[peak]){
            return peak;
        }
        int leftSide = orderAgnosticBS(arr,target,0,peak);
        if(leftSide != -1){
            return leftSide;
        }
        return orderAgnosticBS(arr,target,peak,arr.length-1);
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
        //at loop break start and end will have same value, the greatest number's index.
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target,int start, int end){
        //check order
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            //int mid = (start+end)/2 might give error if start and end are large integers.
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
