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
}
