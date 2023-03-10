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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode body = head;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val) {
                body.next = list1;
                list1 = list1.next;
            } else {
                body.next = list2;
                list2 = list2.next;
            }
            body = body.next;
        }
        body.next = list1 == null ? list2 : list1;
        return head.next;
    }
}