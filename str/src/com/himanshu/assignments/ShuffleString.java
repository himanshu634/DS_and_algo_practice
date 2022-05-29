package com.himanshu.assignments;

// https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public String restoreString(String s, int[] arr){
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < arr.length; i++){
            char ch = s.charAt(i);
            sb.setCharAt(arr[i], ch);
        }
        return sb.toString();
    }

}
