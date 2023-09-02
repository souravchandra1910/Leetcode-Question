/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> st = new Stack<>();
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> mq = new ArrayDeque<>();
        mq.add(root);
        while (mq.size() > 0) {
            int size = mq.size();
            List<Integer> al = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                root = mq.poll();
                al.add(root.val);
                if (root.left != null) {
                    mq.add(root.left);
                }
                if (root.right != null) {
                    mq.add(root.right);
                }
            }
            st.push(al);
        }
        List<List<Integer>> ans = new ArrayList<>();
        while (st.size() > 0) {
            ans.add(st.pop());
        }
        return ans;
    }
}
