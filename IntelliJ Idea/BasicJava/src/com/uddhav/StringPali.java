package com.uddhav;

//Palindrome of sting
public class StringPali {
    public static void main(String[] args) {
        String newString = "accddbddcca";
        System.out.println(stringPali(newString));
    }
    static boolean stringPali(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int start = s.charAt(i);
            int end = s.charAt(s.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
