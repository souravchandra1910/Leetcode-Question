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

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode n = l2;
        ListNode dummy = l1;
        ListNode itr = head;
        while (itr != null) {
            if (itr.val < x) {
                ListNode node = new ListNode(itr.val);
                l1.next = node;
                l1 = node;
                itr = itr.next;
            } else {
                ListNode node = new ListNode(itr.val);
                l2.next = node;
                l2 = node;
                itr = itr.next;
            }
        }
        l1.next = n.next;
        return dummy.next;
    }
}
