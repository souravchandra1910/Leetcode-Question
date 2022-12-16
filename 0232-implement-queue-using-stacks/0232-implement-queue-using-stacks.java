class MyQueue {

    /** Initialize your data structure here. */
      Stack<Integer>st=new Stack<>();
      Stack<Integer>helper=new Stack<>();
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        // how to implement push()
		// 1st step -> Move all st elements to helper
		    while(!st.isEmpty()) {
		    	int val=st.pop();
		    	helper.push(val);
		    }
		 // 2nd step -> push in x in the st 
		 st.push(x);
		 // 3rd step -> Move all helper  elements to st
		 while(!helper.isEmpty()) {
			 int val=helper.pop();
			 st.push(val);
		 }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return st.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return st.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
       	return st.isEmpty();
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