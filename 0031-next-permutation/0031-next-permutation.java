class Solution {

    public void nextPermutation(int[] nums) {
        //1st step: find the break point
        if (nums.length == 1) return;
        int idx = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                //this is the break point;
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            Arrays.sort(nums);
        } else {
            int breakPointNumber = nums[idx];
            int min = nums[idx + 1];
            int minIdx = idx + 1;
            for (int i = idx + 1; i < nums.length; i++) {
                if (nums[i] > breakPointNumber) {
                    if (min > nums[i]) {
                        min = nums[i];
                        minIdx = i;
                    }
                }
            }

            swap(nums, minIdx, idx);

            // sort the rest
            Arrays.sort(nums, idx + 1, nums.length);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
