class MinStack {
    Deque<Integer> st;
    Deque<Integer> min;

    public MinStack() {
        this.st = new ArrayDeque<>();
        this.min = new ArrayDeque<>();
    }

    public void push(int val) {
        st.push(val);
        if (min.size() == 0 || val <= min.peek()) {
            min.push(val);
        }
    }

    public void pop() {
        if (st.peek().equals(min.peek())) {
            st.pop();
            min.pop();
        } else {
            st.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
