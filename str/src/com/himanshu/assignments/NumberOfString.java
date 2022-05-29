package com.himanshu.assignments;

// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

public class NumberOfString {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;

        for(String str : patterns){
            if(word.indexOf(str) > -1){
                ans++;
            }
        }

        return ans;
    }
}
