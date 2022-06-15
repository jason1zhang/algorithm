package recursion;

import structures.*;

/**
 * Recursive algorithm implementations for Linked List data structure.
 * 
 * @author Jason Zhang
 * @version 1.0
 * @since 2022-06-12
 */

public class ListRecursion {

    /**
     * Recursion 1: Reverse List, first implementation
     * 
     * @param head the first node
     * @return the new head of the reversed list
     */
    public static ListNode<Integer> reverseList(ListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode<Integer> p = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }

    /**
     * Recursion 2: Merge two sorted List, first implementation
     * 
     * @param headA the first head
     * @param headB the second head
     * @return the new head of the merged list
     */
    public static ListNode<Integer> mergeList(ListNode<Integer> headA, ListNode<Integer> headB) {
        if (headA == null) {
            return headB;
        }

        if (headB == null) {
            return headA;
        }

        if (headA.item <= headB.item) {
            headA.next = mergeList(headA.next, headB);
            return headA;
        } else {
            headB.next = mergeList(headA, headB.next);
            return headB;
        }
    }
}
