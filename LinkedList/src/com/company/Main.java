package com.company;

import com.company.examples.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(6);
        ll.insertFirst(54);

        ll.insertLast(878);

        ll.insertAt(2, 78787);
        ll.display();
        System.out.println();
        System.out.println(ll.deleteLast());
        System.out.println();
        ll.display();
    }
}
