package com.Examples.easy;

// https://leetcode.com/problems/flipping-an-image/

public class FlipTheImage {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int[] sub : image){
            int end = sub.length - 1;
            for(int j = 0; j <= (sub.length)/ 2; j++){
                int temp = sub[j];
                sub[j] = (sub[end] ^ 1);
                sub[end--] = (temp ^ 1);
            }
            if((sub.length & 1) == 1){
                sub[end] = (sub[end] ^ 1);
            }
        }

        return image;
    }
}
