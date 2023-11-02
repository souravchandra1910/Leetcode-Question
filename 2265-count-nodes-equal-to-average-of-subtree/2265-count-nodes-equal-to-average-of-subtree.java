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

    public int averageOfSubtree(TreeNode root) {
        if (root == null) return 0;
        int[] ans = new int[1];
        sum(root, ans);
        return ans[0];
    }

    private int[] sum(TreeNode root, int[] ans) {
        if (root == null) return new int[] { 0, 0 };

        int[] left = sum(root.left, ans);
        int[] right = sum(root.right, ans);
        int totalSum = root.val + left[0] + right[0];
        int totalCount = 1 + left[1] + right[1];
        int avg = totalSum / totalCount;
        if (avg == root.val) {
            ans[0]++;
        }

        return new int[] { totalSum, totalCount };
    }
}
