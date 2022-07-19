package com.company;

import com.company.examples.CircularLinkedList;
import com.company.examples.DoublyLinkedList;
import com.company.examples.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        ll1.insertFirst(1);
        ll1.insertAt(2,2);
        ll1.insertAt(3, 3);
        ll1.insertAt(4, 5);
        ll1.insertRec(4, 4);
        ll1.insertRec(6,6);
        ll1.insertLast(10);
        ll1.display();
        System.out.println("This is ll1");

        ll1.reverse(ll1.getHead());

        ll1.display();
    }
}
