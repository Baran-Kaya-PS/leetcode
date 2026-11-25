import java.util.HashMap;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int i = 0;
        ListNode next = head;
        HashMap<Integer,ListNode> map = new HashMap();
        while (next != null){
            if (!map.containsValue(next)){
                map.put(i,next);
                i++;
                next = next.next;
            } else return next;
        }
        return null;
    }
}