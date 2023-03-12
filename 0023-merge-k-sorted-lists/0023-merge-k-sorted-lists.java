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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return  null;
        return mergeList(lists,0,lists.length-1);
    }
    
    public ListNode mergeList(ListNode []arr,int si,int ei){
        if(si>ei)return null;
        if(si==ei)return arr[ei];
        int mid=(si+ei)/2;
        ListNode l1=mergeList(arr,si,mid);
        ListNode l2=mergeList(arr,mid+1,ei);
        
        return merge(l1,l2);
        
    }
    
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null || l2==null)return l1!=null?l1:l2;
        ListNode dummy=new ListNode(0);
        ListNode merge=dummy;
        ListNode c1=l1,c2=l2;
        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                merge.next=c1;
                c1=c1.next;
            }else{
                merge.next=c2;
                c2=c2.next;
            }
            merge=merge.next;
        }
        merge.next=c1!=null?c1:c2;
        return dummy.next;
    }
}