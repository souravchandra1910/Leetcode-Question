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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        if (root == null) return al;
        List<Integer> lt = inorderTraversal(root.left);
        al.addAll(lt);
        al.add(root.val);
        List<Integer> rt = inorderTraversal(root.right);
        al.addAll(rt);
        return al;
    }
}
