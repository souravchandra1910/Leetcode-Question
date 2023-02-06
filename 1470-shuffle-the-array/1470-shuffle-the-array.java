class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int i = 0;
        int j = n;
        int idx = 0;
        boolean odd = false;
        while (j < nums.length) {
            arr[idx++] = odd == true ? nums[j++] : nums[i++];
            odd = !odd;
        }
        return arr;
    }
}
