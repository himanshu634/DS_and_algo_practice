package com.himanshu.assignments;


//https://leetcode.com/problems/implement-strstr/submissions/

import java.util.Objects;

public class StrStr {
    class Solution {
        public int strStr(String haystack, String needle) {
            if(Objects.equals(needle, "")){
                return 0;
            }
            return haystack.indexOf(needle);
        }
    }
}
