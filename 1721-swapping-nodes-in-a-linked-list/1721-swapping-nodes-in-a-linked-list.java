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
    // the idea is to start iterating from head by having two pointers fast and slow
    // fast will be moved ahead by k-1 steps
    //now slow and fast w
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode fast = head, slow = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        ListNode ptr1 = fast;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode ptr2 = slow;

        int temp = ptr2.val;
        ptr2.val = ptr1.val;
        ptr1.val = temp;
        return head;
    }
}
