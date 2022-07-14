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

        LinkedList ll2 = new LinkedList();

        ll2.insertLast(1);
        ll2.insertLast(2);
        ll2.insertLast(7);
        ll2.insertLast(8);
        ll2.insertLast(9);
        ll2.display();
        System.out.println();

        LinkedList ll3 = ll2.merge(ll1, ll2);

        ll3.display();

    }
}
