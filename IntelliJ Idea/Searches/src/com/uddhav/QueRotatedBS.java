package com.uddhav;

public class QueRotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2,3};
        int target = 0;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){//if array is not rotated
            return binarySearch(arr,target,0, arr.length-1);
        }
        if(target == arr[pivot]){
            return pivot;
        } else if(target < arr[0]){//if target is smaller than start
            return binarySearch(arr, target, pivot + 1, arr.length -1);
        }
        return binarySearch(arr,target,0,pivot - 1);
    }
    static int binarySearch(int[] arr, int target,int start, int end){
        while(start <= end){
            int min = start + (end - start)/2;
            if(target < arr[min]){
                end = min - 1;
            } else if(target > arr[min]){
                start = min + 1;
            } else if (target == arr[min]){
                return min;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){//this is for non-duplicate arrays
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            } else if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){//this is for duplicate values in arrays
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //if element at start, mid and end are equal skip duplicates i.e. start and end;
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //what if start and end elements were pivots
                if(arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            } else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] < arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
