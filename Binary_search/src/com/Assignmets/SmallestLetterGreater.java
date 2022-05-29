package com.Assignmets;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/

public class SmallestLetterGreater {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

          if(letters[mid] <= target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }


        }
        if(start >= letters.length){
            return letters[0];
        }else {
            return letters[start];
        }
    }
}
