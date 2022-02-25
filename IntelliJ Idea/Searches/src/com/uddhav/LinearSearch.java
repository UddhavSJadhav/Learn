package com.uddhav;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {1,2,4,5,7,6,52,44,34,55,66,22};
        System.out.println(search(num,34));

        System.out.println(search(num,34,2,5));

        String alpha = "Uddhav";
        System.out.println(search(alpha,'a'));
    }

    //search in String
    static boolean search(String a, char b){
        if(a.length()==0){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==b){
                return true;
            }
        }
        //or
        for (char c : a.toCharArray()) {
            if(c==b){
                return true;
            }
        }
        return false;
    }

    //search in Array
    static int search(int[] arr, int target){
        if(arr.length==0){ //if array is empty
            return -1;
        }
        for (int i = 0; i < arr.length; i++) { //check array linearly
            if(arr[i]==target){
                return i;
            }
        }
        return -1; //nothing found in array
    }

    //Search in Range in array
    static int search(int[] arr, int target, int start, int end){
        if(arr.length==0){ //if array is empty
            return -1;
        }
        for (int i = start; i <= end; i++) { //check array linearly
            if(arr[i]==target){
                return i;
            }
        }
        return -1; //nothing found in array
    }
}
