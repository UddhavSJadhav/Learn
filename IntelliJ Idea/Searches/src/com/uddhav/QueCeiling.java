package com.uddhav;

public class QueCeiling {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9,13,17,19,34,54,67,86};
        int ans = findCeiling(arr,33);
        System.out.println(ans);
        System.out.println(arr[ans]);

        ans = findFloor(arr,33);
        System.out.println(ans);
        System.out.println(arr[ans]);
    }

    //Ceiling means the smallest element in an array greater than or = target.
    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target == arr[end]){
            return -1; //if the target is greatest in the array.
        }

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }

    //Floor means the greatest element in an array smaller than or = target.
    static int findFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        if(target == arr[start]){
            return -1; //if the target is smallest in the array.
        }

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
