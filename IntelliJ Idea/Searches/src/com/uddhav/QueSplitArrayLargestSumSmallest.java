package com.uddhav;
//split array in m number of sub-arrays, get the highest sum by a sub-array in each case and return smallest after all cases.
/*e.g
arr = [1,7,4,8]  m= 2;
                            highest is each case
[1] = 1; [7,4,8] = 19               19
[1,7] = 8; [4,8] = 12               12
[1,7,4] = 12; [8] = 8               12
here the lowest sum from all greatest sum of each case is 12;
*/
public class QueSplitArrayLargestSumSmallest {
    public static void main(String[] args) {
        int[] arr = {1,7,4,8};
        int ans = splitArray(arr,2);
        System.out.println(ans);
    }
    static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]);//highest element; here it compares current start with i and updates max to start.
            end += arr[i];//sum of all elements.
        }
        //binary search
        while (start < end){
            //mid might be potential ans
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;//here start == end
    }
}
