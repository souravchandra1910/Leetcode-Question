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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> al = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        dfs(root1, al);
        dfs(root2, bl);
        return al.equals(bl);
    }

    private void dfs(TreeNode root, List<Integer> al) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            al.add(root.val);
            return;
        }
        dfs(root.left, al);
        dfs(root.right, al);
    }
}
