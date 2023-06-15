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

    class Pair implements Comparable<Pair> {
        int hl;
        int val;

        Pair(int hl, int val) {
            this.hl = hl;
            this.val = val;
        }

        public int compareTo(Pair o) {
            if (this.val == o.val) {
                return this.hl - o.hl;
            } else {
                return o.val - this.val;
            }
        }
    }

    public int maxLevelSum(TreeNode root) {
        List<Pair> al = new ArrayList<>();
        Queue<TreeNode> mq = new ArrayDeque<>();
        if (root != null) {
            mq.add(root);
        }
        int lh = 1;
        while (mq.size() > 0) {
            int size = mq.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                root = mq.remove();
                sum += root.val;
                if (root.left != null) mq.add(root.left);
                if (root.right != null) mq.add(root.right);
            }

            al.add(new Pair(lh, sum));
            lh++;
        }
        Collections.sort(al);

        return al.get(0).hl;
    }
}
