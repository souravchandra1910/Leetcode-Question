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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        if (root == null) return al;
        preorder(al, root);
        return al;
    }

    void preorder(List<Integer> al, TreeNode root) {
        if (root == null) return;
        al.add(root.val);
        preorder(al, root.left);
        preorder(al, root.right);
    }
}
