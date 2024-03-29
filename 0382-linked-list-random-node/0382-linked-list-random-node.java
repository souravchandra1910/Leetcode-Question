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
    List<Integer> al = new ArrayList<>();

    public Solution(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            al.add(curr.val);
            curr = curr.next;
        }
    }

    public int getRandom() {
        int random = (int) ((Math.random() * (al.size() - 0)) + 0);
        return al.get(random);
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
