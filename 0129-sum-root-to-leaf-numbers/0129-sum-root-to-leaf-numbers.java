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
    int res = 0;
    int s;

    public int sumNumbers(TreeNode root) {
        t(root);
        return res;
    }

    void t(TreeNode root) {
        if (root == null) {
            return;
        }
        s = s * 10;
        s += root.val;
        if (root.left == null && root.right == null) {
            res += s;
        }
        t(root.left);
        if (root.left != null) {
            s -= root.left.val;
            s /= 10;
        }
        t(root.right);
        if (root.right != null) {
            s -= root.right.val;
            s /= 10;
        }
    }
}
