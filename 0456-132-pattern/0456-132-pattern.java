class Solution {

    public boolean find132pattern(int[] nums) {
        int sm = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < sm) return true;
            while (st.size() > 0 && st.peek() < nums[i]) {
                sm=Math.max(sm,st.peek());
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
