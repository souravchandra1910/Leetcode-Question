class MyQueue {
    Stack<Integer> st;
    Stack<Integer> mt;

    public MyQueue() {
        this.st = new Stack<>();
        this.mt = new Stack<>();
    }

    public void push(int x) {
        // 1st step -> push all elements from the main stack to the helper stack
        while (!st.isEmpty()) {
            int val = st.pop();
            mt.push(val);
        }
        // 2nd step -> push in x in the st
        st.push(x);
        // 3rd step -> Move all helper  elements to st
        while (!mt.isEmpty()) {
            int val = mt.pop();
            st.push(val);
        }
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        return st.size() == 0;
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
