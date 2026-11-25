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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lenght = 0;
        ListNode cur = head;
        while (cur != null){
            cur = cur.next;
            lenght++;
        }
        if ((lenght == 1)) return head.next;
        if (lenght == n) return head.next;
        cur = head;
        ListNode prev = cur;
        for (int i = 0; i < lenght-n;i++){
            prev = cur;
            cur = cur.next;
        }
        prev.next = cur.next;
        return head;

    }
}