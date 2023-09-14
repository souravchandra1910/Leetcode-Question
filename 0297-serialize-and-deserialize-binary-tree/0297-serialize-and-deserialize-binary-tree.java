/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> mq = new LinkedList<>();
        mq.add(root);
        while (mq.size() > 0) {
             root = mq.poll();
            if (root == null) {
                sb.append("$,");
                continue;
            }
            sb.append(root.val + ",");
            mq.add(root.left);
            mq.add(root.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0) return null;
        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> mq = new ArrayDeque<>();
        mq.add(root);
        for (int i = 1; i < arr.length; i++) {
            TreeNode parent = mq.poll();
            if(!arr[i].equals("$")){
                TreeNode left=new TreeNode(Integer.parseInt(arr[i]));
                parent.left=left;
                mq.add(left);
            }
            if (!arr[++i].equals("$")) {
                TreeNode right = new TreeNode(Integer.parseInt(arr[i]));
                parent.right = right;
                mq.add(right);
            }
        }
        return root;
    }
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
