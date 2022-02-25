package com.uddhav;
//if we don't know given array is in ascending order or descending order.
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-24,-12,0,1,3,6,8,12,34,45,68,89};
        int[] arr2 = {98,86,64,52,13,9,6,4,2,0,-1,-14,-56};
        System.out.println(orderAgnosticBS(arr2,-14));
    }

    //return index
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
