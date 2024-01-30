class Solution {

    public int evalRPN(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for (String str : arr) {
            if (str.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            } else if (str.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            } else if (str.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            } else if (str.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            } else {
                int val = Integer.parseInt(str);
                st.push(val);
            }
        }
        return st.pop();
    }
}
