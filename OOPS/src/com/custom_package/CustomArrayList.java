package com.custom_package;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        this.data[size++] = num;
    }

    private boolean isFull(){
        return this.size == this.data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        System.arraycopy(this.data, 0, temp, 0, this.data.length);
        this.data = temp;
    }

    public int remove(){
        return this.data[size--];
    }

    public int size(){
        return this.size + 1;
    }

    public int get(int index){
        return this.data[index];
    }

    public int set(int index, int data){
        this.data[index] = data;
        return this.data[index];
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){
        CustomArrayList ca = new CustomArrayList();
        ca.add(19);
        ca.add(30);
        ca.add(45);

        System.out.println(ca);
    }
}
