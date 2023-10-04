class Solution {

    public int differenceOfSum(int[] nums) {
        int sum = 0, sum1 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int temp = nums[i];
            while (temp > 0) {
                sum1 += temp % 10;
                temp /= 10;
            }
        }

        return Math.abs(sum - sum1);
    }
}
