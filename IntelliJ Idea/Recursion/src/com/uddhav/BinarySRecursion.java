package com.uddhav;

public class BinarySRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(bsrecursion(arr,4,0,arr.length-1));
    }

    static int bsrecursion(int[] arr,int target, int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start+(end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return bsrecursion(arr,target,mid+1,end);
        }else{
            return bsrecursion(arr,target,start,mid-1);
        }
    }
}
