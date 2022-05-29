package com.LectureExamples;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/

public class GreatestLetter {

    public char findNextGreatestLetter(char[] letters, char target){
        int start = 0, end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

}
