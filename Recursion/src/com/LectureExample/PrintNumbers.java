package com.LectureExample;

public class PrintNumbers {
    public void print(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    // This is will print both ascending and descending
    public void printBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }
}
