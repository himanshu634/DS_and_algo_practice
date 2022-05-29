package com.Inheritance;

public class Box {
    public int l;
    public int b;
    public int w;

    public Box(){
        this.l = -1;
        this.b = -1;
        this.w = -1;
    }

    // cube
    public Box(int side){
        this.l = side;
        this.b = side;
        this.w = side;
    }

   public Box(int l, int b, int w){
        this.l = l;
        this.b = b;
        this.w = w;
    }

    public static void noStatic(int a){
    }
}
