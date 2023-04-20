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

    public class Pair {
        TreeNode node;
        int idx;

        Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        Queue<Pair> mq = new ArrayDeque<>();
        mq.add(new Pair(root, 0));
        while (mq.size() > 0) {
            int size = mq.size();
            int min = mq.peek().idx;
            int f = 0, l = 0;
            for (int i = 0; i < size; i++) {
                Pair p = mq.remove();
                int cidx = p.idx - min;
                root = p.node;
                if (i == 0) f = cidx;
                if (i == size - 1) l = cidx;
                if (root.left != null) mq.add(new Pair(root.left, cidx * 2 + 1));
                if (root.right != null) mq.add(new Pair(root.right, cidx * 2 + 2));
            }
            max = Math.max(max, l - f + 1);
        }
        return max;
    }
}
