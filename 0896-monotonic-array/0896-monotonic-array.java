class Solution {

    public boolean isMonotonic(int[] nums) {
        return checkInc(nums) || checkDec(nums);
    }

    private boolean checkInc(int[] nums) {
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (prev <= curr) {
                prev = curr;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean checkDec(int[] nums) {
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr <= prev) {
                prev = curr;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
