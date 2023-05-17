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
        if (head == null || head.next == null) return 0;
        List<Integer> al = new ArrayList<>();
        ListNode itr = head;
        while (itr != null) {
            al.add(itr.val);
            itr = itr.next;
        }
        int max = 0;
        int i = 0, j = al.size() - 1;
        while (i < j) {
            int sum = al.get(i) + al.get(j);
            max = Math.max(sum, max);
            i++;
            j--;
        }
        return max;
    }
}
