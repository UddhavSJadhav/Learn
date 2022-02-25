package com.uddhav;
/*Que: Find Richest Person
* array1 = {{1,2,3},{3,4,1}}
* here person1 is 1st sub array, person2 is 2nd sub array.
* therefore, person1 wealth = 1+2+3=6, person2 wealth = 3+4+1 =8
* person2 is richest.
* */
public class QueFindWealthy {
    public static void main(String[] args) {
        int[][] wealth = {{1,2,3},{5,4,1},{4,2,13}};
        richOne(wealth);
    }
    static void richOne(int[][] p){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < p.length; i++) {
            int rowsum = 0;
            for (int j = 0; j <p[i].length ; j++) {
                rowsum+=p[i][j];
            }
            if(rowsum>ans){
                ans = rowsum;
            }
        }
        System.out.println(ans);
    }
}
