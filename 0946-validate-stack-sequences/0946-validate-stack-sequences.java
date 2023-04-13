class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        ArrayDeque<Integer>st=new ArrayDeque<>();
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(st.size()>0 && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        return j==pushed.length;
    }
}
