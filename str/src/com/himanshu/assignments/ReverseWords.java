package com.himanshu.assignments;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");

        for(String str : arr){
            sb.append(reverse(str)).append(" ");
        }

        return sb.toString().strip();
    }

    private String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
