import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode dummy = head.next;
        Deque<ListNode> dq = new ArrayDeque<>();
        while (dummy != null) {
            dq.add(dummy);
            dummy = dummy.next;
        }
        boolean front = false;
        while (!dq.isEmpty()) {
            ListNode curr = (front) ? dq.pollFirst() : dq.pollLast();
            head.next = curr;
            head = head.next;
            curr.next = null;
            front = !front;
        }
    }
}