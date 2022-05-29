package com.Inheritance;

public class BoxPrice extends BoxWeight{
    int price;

    public BoxPrice(){
        this.price = 0;
    }

    public BoxPrice(int l, int b, int w, int weight, int price){
        super(l, b, w, weight);
        this.price = price;
    }

}
