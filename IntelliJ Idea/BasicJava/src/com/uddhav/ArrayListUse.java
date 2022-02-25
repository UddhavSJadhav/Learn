package com.uddhav;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(10);
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(8);

        list.set(0, 3); //(index , updated to )
        list.remove(2);

        System.out.println(list.get(0)); // to get an element with index

        System.out.println(list.contains(8)); // true

        twoDArrayList();
    }

    static void twoDArrayList(){
        Scanner in = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);//declaration
        
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); //initialization
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
