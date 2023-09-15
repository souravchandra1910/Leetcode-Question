class Solution {

    public boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = min1;
        for (int val : nums) {
            if (min1 >= val) {
                min1 = val;
            } else if (min2 >= val) {
                min2 = val;
            } else {
                return true;
            }
        }
        return false;
    }
}
