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

    public int pairSum(ListNode head) {
        ListNode mid = middle(head);
        ListNode next = mid.next;
        mid.next = null;
        next = reverse(next);
        ListNode c1 = head;
        ListNode c2 = next;
        int max = 0;
        while (c1 != null) {
            max = Math.max(max, c1.val + c2.val);
            c1 = c1.next;
            c2 = c2.next;
        }
        next = reverse(next);
        mid.next = next;
        return max;
    }

    ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    ListNode middle(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
