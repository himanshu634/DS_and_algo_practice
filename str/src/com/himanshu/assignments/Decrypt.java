package com.himanshu.assignments;

import java.util.Arrays;

// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

public class Decrypt {
    public String decrypt(String s){
        StringBuilder sb = new StringBuilder();
        int strLen = s.length();

        for(int i = 0; i < strLen; i++){
            if(i < (strLen - 2) && s.charAt(i + 2) == '#'){
                int number = Integer.parseInt(s.substring(i, i + 2)) - 1;
                sb.append((char)('a' + number));
                i += 2;
            }else{
                sb.append((char)('a' + Integer.parseInt(s.charAt(i) + "") - 1));
            }
        }

      return sb.toString();
    }
}
