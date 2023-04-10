class Solution {

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char ch : arr) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0) return false; // can't pop if its size is zero
                else if ((ch == ')' && st.peek() == '(') || 
                         (ch == '}' && st.peek() == '{') || 
                         (ch == ']' && st.peek() == '[')) {
                    st.pop();
                } else return false;// if the pair doesn't match
            }
        }
        return st.size() == 0;
    }
}
