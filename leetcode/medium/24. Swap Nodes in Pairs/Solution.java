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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode act = temp.next;
        while (temp != null && act != null){
            int temp2 = temp.val;
            temp.val = act.val;
            act.val = temp2;
            if (temp.next.next != null && act.next.next != null) {
                temp = temp.next.next;
                act = act.next.next;
            } else return head;
        }
        return head;
    }
}