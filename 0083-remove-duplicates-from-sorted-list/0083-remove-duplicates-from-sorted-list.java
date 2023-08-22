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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode forw = null;
        while (curr != null) {
            forw = curr.next;
            if(forw==null)break;
            if (forw.val == curr.val) {
                curr.next= forw.next;
            }else curr=curr.next;
        }
        return head;
    }
}
