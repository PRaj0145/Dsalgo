package com.dsaalgo.recursion;

public class Subsequences {
    public static void subsequences(String str, int i, String newString){
        if(i == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(i);
        // to be included
         subsequences(str, i+1 , newString+currChar);
         // to be not included
        subsequences(str, i+1, newString);
    }

    public static void main(String[] args) {
        String str = "abcd";
        subsequences(str, 0, "");
    }
}
