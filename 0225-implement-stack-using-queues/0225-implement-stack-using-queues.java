class MyStack {
    Queue<Integer> mq;

    public MyStack() {
        this.mq = new ArrayDeque<>();
    }

    public void push(int x) {
        mq.add(x);
        for (int i = 0; i < mq.size() - 1; i++) {
            mq.add(mq.poll());
        }
    }

    public int pop() {
        return mq.remove();
    }

    public int top() {
        return mq.peek();
    }

    public boolean empty() {
        return mq.size() == 0;
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
