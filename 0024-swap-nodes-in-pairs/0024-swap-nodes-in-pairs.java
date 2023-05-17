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
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) { // both the nodes exist
            //get
            ListNode curr = prev.next;
            ListNode forw = prev.next.next;

            //swap
            curr.next = forw.next;
            forw.next = curr;

            //update pointers
            prev.next = forw;
            prev = curr;
        }
        return dummy.next;
    }
}
