class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            if (st.size() > 0 && st.peek() == popped[j]) {
                while (st.size() > 0 && st.peek() == popped[j]) {
                    st.pop();
                    j++;
                }
            }
            st.push(pushed[i]);
        }
        if (st.size() > 0 && st.peek() == popped[j]) {
            while (st.size() > 0 && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        return st.size() == 0;
    }
}
