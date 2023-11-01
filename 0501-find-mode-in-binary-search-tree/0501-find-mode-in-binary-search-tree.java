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

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        if (root == null) return null;
        dfs(root, hm);
        int max = 0;
        for (Integer n : hm.keySet()) {
            max = Math.max(max, hm.get(n));
        }
        // System.out.println(hm);

        List<Integer> al = new ArrayList<>();
        for (Integer n : hm.keySet()) {
            if (hm.get(n) == max) {
                al.add(n);
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = al.get(i);
        return ans;
    }

    public void dfs(TreeNode root, HashMap<Integer, Integer> hm) {
        if (root == null) return;

        hm.put(root.val, hm.getOrDefault(root.val, 0) + 1);
        dfs(root.left, hm);
        dfs(root.right, hm);
    }
}
