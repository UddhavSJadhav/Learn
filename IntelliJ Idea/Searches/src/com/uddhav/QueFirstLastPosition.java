package com.uddhav;

import java.util.Arrays;

//Find from where to where is 7 ans: from index 5 to index 8 i.e. [5,8].
public class QueFirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,7,7,7,8,9};
        int[] ans = firstlastPosi(arr,7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] firstlastPosi(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = findPosition(arr,target,true);
        if(ans[0] != -1){
            ans[1] = findPosition(arr,target,false);
        }
        return ans;
    }

    static int findPosition(int[] arr, int target, boolean findFirstIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
             int mid = start + (end - start)/2;

             if(target < arr[mid]){
                 end = mid - 1;
             }else if (target > arr[mid]){
                 start = mid + 1;
             } else {
                 ans = mid;
                 if(findFirstIndex){
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }
        }

        return ans;
    }
}
