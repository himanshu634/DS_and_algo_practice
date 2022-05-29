package com.company.examples;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        head = node;

        if(tail == null){
            tail = node;
        }

        size++;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertLast(int value){
        Node node = new Node(value);

        if(tail == null){
            insertFirst(value);
            return;
        }

        tail.next = node;
        tail = node;

        size++;
    }

    public void insertAt(int position, int value){
        if(position >= size){
            insertLast(value);
            return;
        }

        if(position == 0){
            insertFirst(value);
            return;
        }

        Node temp = head;

        for(int i = 1; i < position; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);

        temp.next = node;

        size++;
    }

    public int deleteFirst(){
        int value = head.value;

        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
        return value;
    }

    public int deleteLast(){
        Node temp = head;
        if(size <= 1){
            return deleteFirst();
        }
        for(int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        tail.next = null;
        size--;

        return val;
    }


}
