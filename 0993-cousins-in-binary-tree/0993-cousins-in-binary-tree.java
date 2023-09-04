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
        TreeNode node, parent;
        int level;

        Pair(TreeNode node, TreeNode parent, int level) {
            this.node = node;
            this.parent = parent;
            this.level = level;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        Pair node1 = search(root, x);
        Pair node2 = search(root, y);

        return node1.parent != null && node2.parent != null && node1.level == node2.level && node1.parent != node2.parent;
    }

    private Pair search(TreeNode root, int x) {
        Queue<Pair> mq = new ArrayDeque<>(); // in tbis i will be storing node, parent
        mq.add(new Pair(root, null, 1));
        while (mq.size() > 0) {
            int size = mq.size();
            for (int i = 0; i < size; i++) {
                Pair p = mq.poll();
                root = p.node;
                TreeNode parent = p.parent;
                int level = p.level;
                if (root.val == x) {
                    return new Pair(root, parent, level);
                }
                if (root.left != null) mq.add(new Pair(root.left, root, level + 1));
                if (root.right != null) mq.add(new Pair(root.right, root, level + 1));
            }
        }

        return new Pair(null, null, -1);
    }
}
