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

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = head, sh = head.next, forw = null, curr = sh;
        while (curr != null && curr.next != null) {
            forw = curr.next;

            prev.next = forw;
            curr.next = forw.next;

            prev = forw;
            curr = forw.next;
        }
        prev.next = sh;
        return dummy.next;
    }
    // 1 2 3 4
    // p c
    // 1->3-5->2->4->6
}
