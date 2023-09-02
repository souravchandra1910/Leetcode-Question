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
        if (root == null) return ans;
        ArrayDeque<TreeNode> mq = new ArrayDeque<>();
        mq.add(root);
        boolean flag = true;
        while (mq.size() > 0) {
            int size = mq.size();
            List<Integer> al = new ArrayList<>();
            if (flag == true) {
                for (int i = 0; i < size; i++) {
                    root = mq.poll();
                    al.add(root.val);
                    if (root.left != null) mq.addLast(root.left);
                    if (root.right != null) mq.addLast(root.right);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    root = mq.pollLast();
                    al.add(root.val);
                    if (root.right != null) mq.addFirst(root.right);
                    if (root.left != null) mq.addFirst(root.left);
                }
            }
            flag = !flag;
            ans.add(al);
        }
        return ans;
    }
}
