class Solution {

    public int arraySign(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            if (nums[i] < 0) cnt++;
        }
        return (cnt & 1) == 0 ? 1 : -1;
    }
}
