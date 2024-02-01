class Solution {

    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nser = new int[n];
        st.push(n - 1);
        nser[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nser[i] = 0;
            } else {
                nser[i] = st.peek() - i;
            }
            st.push(i);
        }

        return nser;
    }
}
