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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> mq = new ArrayDeque<>();
        boolean flag = true;
        if (root == null) return ans;
        mq.add(root);
        while (mq.size() > 0) {
            int size = mq.size();
            if (flag == true) {
                List<Integer> al = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    root = mq.poll();
                    al.add(root.val);
                    if (root.left != null) mq.add(root.left);
                    if (root.right != null) mq.add(root.right);
                }
                ans.add(al);
            } else {
                List<Integer> al = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    root = mq.poll();
                    al.add(0, root.val);
                    if (root.left != null) mq.add(root.left);
                    if (root.right != null) mq.add(root.right);
                }
                ans.add(al);
            }

            flag = !flag;
        }
        return ans;
    }
}
