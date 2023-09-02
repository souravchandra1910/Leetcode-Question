/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(root);
        while (mq.size() > 0) {
            int size = mq.size();
            for (int i = 0; i < size; i++) {
                Node node = mq.poll();
                // System.out.println(node.val);
                if (node.left != null) mq.add(node.left);
                if (node.right != null) mq.add(node.right);
                if (i == size - 1) {
                    // System.out.println(node.val);
                    node.next = null;
                } else {
                    // System.out.println(node.val);
                    node.next = mq.peek();
                }
            }
        }
        return root;
    }
}
