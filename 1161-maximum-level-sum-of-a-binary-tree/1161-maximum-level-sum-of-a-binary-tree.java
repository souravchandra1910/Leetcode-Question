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
        TreeNode root;
        int level;

        Pair(TreeNode root, int level) {
            this.root = root;
            this.level = level;
        }
    }

    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        List<Pair> al = new ArrayList<>();
        Queue<Pair> mq = new ArrayDeque<>();
        mq.add(new Pair(root, 1));
        int max = Integer.MIN_VALUE;
        int minLevel = 0;
        while (mq.size() > 0) {
            int size = mq.size();
            int lvl = mq.peek().level;
            int sum = 0;
            for (int i = 0; i < size; i++) {
                Pair p = mq.poll();
                TreeNode node = p.root;
                int level = p.level;
                int val = p.root.val;
                sum += val;
                if (node.left != null) mq.add(new Pair(node.left, level + 1));
                if (node.right != null) mq.add(new Pair(node.right, level + 1));
            }
            if (sum > max) {
                max = sum;
                minLevel = lvl;
            }
        }
        return minLevel;
    }
}
