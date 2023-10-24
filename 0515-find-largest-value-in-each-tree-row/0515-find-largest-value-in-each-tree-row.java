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

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        Queue<TreeNode> mq = new ArrayDeque<>();
        if (root == null) return al;
        mq.add(root);
        while (mq.size() > 0) {
            int size = mq.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                root = mq.poll();
                max = Math.max(max, root.val);
                if (root.left != null) mq.add(root.left);
                if (root.right != null) mq.add(root.right);
            }
            al.add(max);
        }
        return al;
    }
}
