class Solution {

    public int longestNiceSubarray(int[] nums) {
        int[] set = new int[31];
        int maxLen = 1;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int k = 0; k < 31; k++) {
                if ((nums[i] & (1 << k)) != 0) {
                    set[k]++;
                    if (set[k] > 1) {
                        flag = true;
                    }
                }
            }
            if (flag == false) maxLen = Math.max(maxLen, i - j + 1); else {
                while (j <= i) {
                    for (int k = 0; k < 31; k++) {
                        if ((nums[j] & (1<< k)) != 0) {
                            set[k]--;
                        }
                    }
                    j++;
                    boolean f = false;
                    for (int k = 0; k < 31; k++) {
                        if (set[k]> 1) f = true;
                    }
                    if (f == false) break;
                }
            }
        }
        return maxLen;
    }
}
