class Solution {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int[] arr = new int[n];
        int idx = n - 1;
        while (i <= j) {
            int sq1 = nums[i] * nums[i];
            int sq2 = nums[j] * nums[j];
            if (sq2 > sq1) {
                arr[idx--] = sq2;
                j--;
            } else {
                arr[idx--] = sq1;
                i++;
            }
        }

        return arr;
    }
}
