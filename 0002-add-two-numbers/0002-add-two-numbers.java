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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode curr1 = l1, curr2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode itr = dummy;
        while (curr1 != null || curr2 != null) {
            int sum = 0;
            if (curr1 != null) sum += curr1.val;
            if (curr2 != null) sum += curr2.val;
            sum += c;
            int val = sum % 10;
            c = sum / 10;
            ListNode node = new ListNode(val);
            itr.next = node;
            itr = node;
            if (curr1 != null) curr1 = curr1.next;
            if (curr2 != null) curr2 = curr2.next;
        }

        if (c != 0) {
            ListNode node = new ListNode(c);
            itr.next = node;
            itr = node;
        }
        return dummy.next;
    }
}
