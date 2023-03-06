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

    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> mq = new ArrayDeque<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        if (root == null) return 0;
        mq.add(root);
       
        while (mq.size() > 0) {
            int size = mq.size();
            long sum = 0L;
            for (int i = 0; i < size; i++) {
                root = mq.poll();
                sum += root.val;
                if (root.left != null) mq.add(root.left);
                if (root.right != null) mq.add(root.right);
            }
            pq.add(sum);
        }
        if (pq.size() < k) return -1;
        while (pq.size() > k) pq.poll();
        return pq.poll();
    }
}
