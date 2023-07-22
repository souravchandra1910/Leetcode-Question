class Solution {

    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int val : arr) {
            if (val > 0) {
                st.push(val);
            } else {
                while (st.size() > 0 && st.peek() > 0 && Math.abs(st.peek()) < Math.abs(val)) {
                    st.pop();
                }
                if (st.size() > 0 && st.peek() > -val) {
                    
                } else if (st.size() > 0 && val == -st.peek()) {
                    st.pop();
                } else {
                    st.push(val);
                }
            }
        }
        int[] ans = new int[st.size()];
        int idx = ans.length - 1;
        while (st.size() > 0) {
            ans[idx--] = st.pop();
        }
        return ans;
    }
}
