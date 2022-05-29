package com.Examples.easy;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

import java.util.Locale;

public class PangramString {
    public boolean checkIfPangram(String sentence){
        boolean[] list = new boolean[26];
        for(int i = 0; i < sentence.length(); i++){
            list[(int)sentence.charAt(i) - 97] = true;
        }
        for(boolean i : list){
            if(i == false){
                return false;
            }
        }
        return true;
    }

    // here we can do in only one step..

    public boolean checkIfPangram2(String sentence){
        int count = 26;
        int[] list = new int[count];
        for(char c: sentence.toCharArray()){
            if(list[c - 'a'] == 0){
                count--;
                list[c - 'a']++;
            }
            if(count == 0) return true;
        }
        return false;
    }


}
