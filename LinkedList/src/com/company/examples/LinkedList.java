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

        Node temp = get(position - 2);
        Node node = new Node(value, temp.next);

        temp.next = node;

        size++;
    }

    public void insertRec(int index, int value){
        head = insertRec(index, value, head);
    }

    private Node insertRec(int index, int value, Node node){
        if(index == 1){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(--index, value, node.next);

        return node;
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
        Node temp = get(size - 1);
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.value;
        tail = temp;
        tail.next = null;
        size--;

        return val;
    }

    public Node get(int position){
        Node temp = head;
        for(int i = 1; i < position; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int delete(int position){
        if(position == 1){
            int val = head.value;
            deleteFirst();
            size--;
            return val;
        }

        if(position == size){
            int val = tail.value;
            deleteLast();
            size--;
            return val;
        }
        Node temp = get(position - 1);

        int val = temp.value;
        temp.next = temp.next.next;

        return val;
    }

    public Node find(int value){
        Node temp = head;

        while(temp.next != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/ --> solved in leetcode

    //https://leetcode.com/problems/merge-two-sorted-lists/ --> solution below
    public LinkedList merge(LinkedList firstList, LinkedList secondList){
        Node first = firstList.head;
        Node second = secondList.head;
        LinkedList ans = new LinkedList();
        while(first != null && second != null){
            if(first.value < second.value){
                ans.insertLast(first.value);
                first = first.next;
            }else{
                ans.insertLast(second.value);
                second = second.next;
            }
        }

            while(first != null){
                ans.insertLast(first.value);
                first = first.next;
            }
            while(second != null){
                ans.insertLast(second.value);
                second = second.next;
            }

            return ans;
    }



}
