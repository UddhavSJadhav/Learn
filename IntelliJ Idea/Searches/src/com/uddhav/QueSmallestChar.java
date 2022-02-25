package com.uddhav;
//smallest char greater then target
public class QueSmallestChar {
    public static void main(String[] args) {
        char[] arr = {'a','c','f','j','k','l'};
        char ans = smallestChar(arr,'f');
        System.out.println(ans);
    }

    static char smallestChar(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}
