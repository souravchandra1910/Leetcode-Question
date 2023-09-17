class Solution {

    public int minimumRightShifts(List<Integer> nums) {
        int prev = nums.get(0);
        int idx = -1;
        int c = 0;
        for (int i = 1; i < nums.size(); i++) {
            int curr = nums.get(i);
            if (curr < prev) {
                idx = i;
                c = curr;
                break;
            }
            prev = curr;
        }
        if (idx == -1) return 0;
        for (int i = idx + 1; i < nums.size(); i++) {
            if (nums.get(i) > prev || nums.get(i) < c) return -1;
        }
        return nums.size() - idx;
    }
}
