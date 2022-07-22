package com.company;

import com.company.examples.*;

public class Main {

    public static void main(String[] args) {
        ReverseKGroup reorderTesting = new ReverseKGroup();

        ListNode list = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                null)))));

        reorderTesting.reverseKGroup(list, 2);


    }
}
