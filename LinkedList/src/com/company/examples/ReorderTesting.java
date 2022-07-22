package com.company.examples;

public class ReorderTesting {
    public ListNode reverse(ListNode head){ // used for isP

        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next = head.next;

        while(current != null){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        return prev;
    }

    public void print(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(slow != null){
            if(fast == null || fast.next == null){
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return null;
    }

    public void reorder(ListNode head){
        if(head == null || head.next == null){
            return ;
        }

        ListNode middle = middleNode(head);

        ListNode headSecond = reverse(middle);

        ListNode headFirst = head;

        while(headFirst != null && headSecond != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        if(headFirst != null){
            headFirst.next = null;
        }
    }
}



