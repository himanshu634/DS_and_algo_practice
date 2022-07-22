package com.company.examples;

public class ReverseKGroup {

    // https://leetcode.com/problems/reverse-nodes-in-k-group/
    public void reverseKGroup(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;

        while(true){
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            ListNode temp = current;
            for(int i = 0; i < k -1; i++){
                temp = temp.next;
                if(temp == null){
                    break;
                }
            }
            if(temp != null){
                for(int i = 0; current != null && i < k; i++){
                    current.next = prev;
                    prev = current;
                    current = next;
                    if(next != null){
                        next = next.next;
                    }
                }

                if(last != null){
                    last.next = prev;
                }else {
                    head = prev;
                }

                newEnd.next = current;

                prev = newEnd;

                if(current == null){
                    break;
                }
            }else {
                break;
            }
        }

        print(head);
    }

    public void print(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }
}
