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
      ListNode dummy=new ListNode(-1),prev=dummy,curr=head,forw=null;
        dummy.next=head;
        while(curr!=null && curr.next!=null){
            forw=curr.next;
            prev.next=forw;
            curr.next=forw.next;
            prev.next.next=curr;
            curr=curr.next;
            prev=prev.next.next;
        }
        return dummy.next;
    }
}