package com.custom_package;

import java.util.Arrays;

public class CustomGenArrayList<T> {

        private Object[] data;
        private static final int DEFAULT_SIZE = 10;
        private int size = 0;

        public CustomGenArrayList(){
            this.data = new Object[DEFAULT_SIZE];
        }

        public void add(T num){
            if(this.isFull()){
                resize();
            }
            this.data[size++] = num;
        }

        private boolean isFull(){
            return this.size == this.data.length;
        }

        private void resize(){
            Object[] temp = new Object[data.length * 2];
            System.arraycopy(this.data, 0, temp, 0, this.data.length);
            this.data = temp;
        }

        public T remove(){
            return (T) this.data[size--];
        }

        public int size(){
            return this.size + 1;
        }

        public T get(int index){
            return (T)(this.data[index]);
        }

        public void set(int index, T data){
            this.data[index] = data;
        }

        @Override
        public String toString() {
            return "CustomGenArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String[] args){
            CustomGenArrayList<Integer> ca = new CustomGenArrayList<>();
            ca.add(19);
            ca.add(30);
            ca.add(45);

            System.out.println(ca);
        }

}
