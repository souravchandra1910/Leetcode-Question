class Solution {

    public int longestNiceSubarray(int[] nums) {
        int[] set = new int[31];

        int maxLen = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];
            boolean flag = false;
            for (int i = 0; i < 31; i++) {
                if ((val & (1 << i)) != 0) {
                    set[i]++;
                    if (set[i] > 1) {
                        flag = true;
                    }
                }
            }
            if (flag == false) {
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                while (left <= right) {
                    int v = nums[left];
                    for (int i = 0; i < 31; i++) {
                        if ((v & (1 << i)) != 0) {
                            set[i]--;
                        }
                    }
                    left++;
                    boolean f = false;
                    for (int i = 0; i < 31; i++) {
                        if (set[i] > 1) f = true;
                    }
                    if (f == false) {
                        // flag = true;
                        break;
                    }
                }
            }
        }
        return maxLen;
    }
}
