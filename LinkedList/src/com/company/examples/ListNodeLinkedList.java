package com.company.examples;

public class ListNodeLinkedList {
    private static class ListNode {
        int val;
        ListNode next;

        //      ListNode(int x) {
//         val = x;
//          next = null;
//      }
//
        ListNode() {
        }
        ListNode(int x, ListNode next){
            this.val = x;
            this.next = next;
        }
        }

    //https://leetcode.com/problems/linked-list-cycle --> solution bellow
    public static boolean isCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // to find length of cycle in linkedlist
    public int findLengthOfCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                ListNode temp = slow;
                int length = 0;

                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

//    https://leetcode.com/problems/linked-list-cycle-ii/ --> solution is below
    public ListNode findBeginningOfCycle(ListNode head){
            ListNode fast = head;
            ListNode slow = head;

            if(head == null){
                return null;
            }

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    slow = head;

                    while(fast != slow){
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return fast;
                }
            }
            return null;
    }

    //https://leetcode.com/problems/middle-of-the-linked-list/ --> solutions below

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

    // https://leetcode.com/problems/sort-list/ --> solution below

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = findMiddle(head);

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

//     private ListNode insertLast(ListNode head,int value){
//         if(head == null){
//             head = new ListNode(value, null);
//             return head;
//         }

//         ListNode temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }

//         temp.next = new ListNode(value, null);

//         return head;
//     }

    private ListNode findMiddle(ListNode head){
        ListNode midPrev = null;

        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;

        return mid;
    }

    private ListNode merge(ListNode first, ListNode second){
        ListNode ans = new ListNode();
        ListNode tail = ans;
        while(first != null && second != null){
            if(first.val < second.val){
                tail.next = first;
                first = first.next;
                tail = tail.next;
            }else {
                tail.next = second;
                tail = tail.next;
                second = second.next;
            }
        }

        tail.next = (first != null) ? first : second;

        return ans.next;
    }
    //    https://leetcode.com/problems/reverse-linked-list-ii/

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = head.next;

        if(left == right){
            return head;
        }

        for(int i = 0; current != null && i < left - 1; i++){
            prev = current;
            current = next;
            next = next.next;
        }

        ListNode first = prev;
        ListNode last =  current;

        for(int i = 0; current != null && i < (right - left) + 1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null)
                next = next.next;
        }

        if(first != null){
            first.next = prev;
        }else{
            head = prev;
        }

        last.next = current;

        return head;

    }

    // https://leetcode.com/problems/palindrome-linked-list/

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast =head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode headSecond= reverse(mid);

        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        return head == null || headSecond == null;
    }
    private ListNode reverse(ListNode head){ // used for isP

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

}
