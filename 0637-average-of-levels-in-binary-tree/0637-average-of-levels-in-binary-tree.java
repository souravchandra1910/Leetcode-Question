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

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> al = new ArrayList<>();
        if (root == null) return al;
        Queue<TreeNode> mq = new ArrayDeque<>();
        mq.add(root);
        while (mq.size() > 0) {
            double sum = 0.0;
            int size = mq.size();
            for (int i = 0; i < size; i++) {
                root = mq.poll();
                sum += root.val;
                if (root.left != null) mq.add(root.left);
                if (root.right != null) mq.add(root.right);
            }
            al.add(sum / (size * 1.0));
        }
        return al;
    }
}
