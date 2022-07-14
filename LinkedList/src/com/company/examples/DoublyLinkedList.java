package com.company.examples;

public class DoublyLinkedList {

    private Node head ;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node temp = new Node(value);
        if (size == 0) {
            head = temp;
            head.prev = null;
            head.next = null;
            tail = head;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + " <- ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int value){
        Node temp = new Node(value);
        if(size == 0){
            tail = temp;
            head = tail;
            tail.next = null;
            tail.prev = null;
        }else{
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    private Node get(int index){
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int value, int index) {
        if (index == 1) {
            insertFirst(value);
        } else if (index == size) {
            insertLast(value);
        } else {
            Node temp = get(index - 1);
            Node newNode = new Node(value);
            temp.next.prev = newNode;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            size++;
        }
    }

    private class Node{
        private final int value;
        private Node next;
        private Node prev;

        public Node(int val){
            this.value = val;
        }

        public Node(int val, Node prev, Node next){
            this.value = val;
            this.prev = prev;
            this.next = next;
        }


    }
}
