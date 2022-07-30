package com.strings;

import java.util.ArrayList;

public class Subseq {
    public void printSubseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubseq(p + ch, up.substring(1));
        printSubseq(p, up.substring(1));
    }

    public ArrayList<String> printSubseq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = printSubseq2(p + ch, up.substring(1));
        ArrayList<String> right = printSubseq2(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
