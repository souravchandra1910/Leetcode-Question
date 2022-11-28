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

    public ListNode removeNodes(ListNode head) {
        if (head == null) return null;
        List<Integer> al = new ArrayList<>();
        ListNode itr = head;
        while (itr != null) {
            al.add(itr.val);
            itr = itr.next;
        }
        Stack<Integer> st = new Stack<>();
        st.push(al.get(0));
        for (int i = 1; i < al.size(); i++) {
            while (st.size() > 0 && st.peek() < al.get(i)) {
                st.pop();
            }
            st.push(al.get(i));
        }
        ListNode dummy = new ListNode(-1);
        ListNode ans = new ListNode(-1);
        dummy.next = ans;
        for (int val : st) {
            ListNode node = new ListNode(val);
            ans.next = node;
            ans = node;
        }
        return dummy.next.next;
    }
}
