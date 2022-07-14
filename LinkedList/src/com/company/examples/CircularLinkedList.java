package com.company.examples;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void insert(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
            temp.next = head;
        }
        tail = temp;
        size++;
    }

    public void delete(int val){
        Node temp = head;

        do{
            if(temp.next.value == val){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }while(temp != head);
        size--;
    }


    public void display(){
        Node temp = head;

        if(head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("END");
    }




    private class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
