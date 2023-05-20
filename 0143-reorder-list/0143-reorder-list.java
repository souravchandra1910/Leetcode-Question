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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        ListNode mid=middle(head);
        ListNode nhead=mid.next;
        mid.next=null;
        nhead=reverse(nhead);
        ListNode c1=head;
        ListNode c2=nhead;
        ListNode f1=null;
        ListNode f2=null;
        while(c2!=null){
            f1=c1.next;
            f2=c2.next;
            
            //linking
            c1.next=c2;
            c2.next=f1;
            
            //update nodes
            c1=f1;
            c2=f2;
        }
        
    }
    public ListNode middle(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode curr=head;
        ListNode prev=null;
        ListNode forw=null;
        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
}