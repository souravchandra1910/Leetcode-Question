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

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        TreeNode root = helper(0, nums.length - 1, nums);
        return root;
    }

    private TreeNode helper(int low, int high, int[] nums) {
        if (low > high) return null;

        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        TreeNode lt = helper(low, mid - 1, nums);
        TreeNode rt = helper(mid + 1, high, nums);
        node.left = lt;
        node.right = rt;

        return node;
    }
}
