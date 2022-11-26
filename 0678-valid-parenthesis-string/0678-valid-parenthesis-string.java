class Solution {

    public boolean checkValidString(String str) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> s = new Stack<>();
        int idx=0;
        for (idx=0;idx<str.length();idx++) {
            char ch=str.charAt(idx);
            if (ch == '(') {
                st.push(idx);
            } else if (ch == '*') {
                s.push(idx);
            } else {
               if(st.size()>0){
                   st.pop();
               }else if(s.size()>0){
                   s.pop();
               }else{
                   return false;
               }
            }
        }
     
            while (st.size() > 0 && s.size() > 0 && st.peek() < s.peek()) {
                st.pop();
                s.pop();
            }
       
        if (st.size() == 0) return true;
        return false;
    }
}
