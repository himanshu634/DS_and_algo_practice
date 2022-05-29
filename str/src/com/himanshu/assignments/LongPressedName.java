package com.himanshu.assignments;

// https://leetcode.com/problems/long-pressed-name/

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length()) return false;

        int i = 0, j = 0;

        while(i < typed.length()){
            if(j < name.length() && typed.charAt(i) == name.charAt(j)){
                j++;
            }else if(i == 0 || typed.charAt(i) != typed.charAt(i - 1)){
                return false;
            }

            i++;
        }

        return j == name.length();
    }
}
