class Solution {

    public int addMinimum(String word) {
        
        Stack<Character> st = new Stack<>(); 
		
        for(int i = 0; i < word.length(); i++)
        {
            char c = word.charAt(i);
            st.push(c);
        }
        
        int count = 0;
        
        while(!st.isEmpty())
        {
            if(!st.isEmpty() && st.peek() == 'c')
            {
                st.pop();
            }
            else
            {
                count++;
            }
            if(!st.isEmpty() && st.peek() == 'b')
            {
                st.pop();
            }
            else
            {
                count++;
            }
            if(!st.isEmpty() && st.peek() == 'a')
            {
                st.pop();
            }
            else
            {
                count++;
            }
        }
        
        return count;
    }

}
