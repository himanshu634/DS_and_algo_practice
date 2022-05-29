package com.himanshu.assignments;

// https://leetcode.com/problems/sorting-the-sentence/

public class SortSentence {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String[] ans = new String[arr.length];

        for(String str: arr){
            ans[Integer.parseInt(str.charAt(str.length() - 1) + "") - 1] =  str.substring(0, str.length() - 1);
        }

        for(String str: ans){
            sb.append(str).append(" ");
        }

        return sb.toString().strip();


    }
}
