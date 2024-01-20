class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        int[] arr = { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (hm.containsKey(val) == true && hm.get(val) != i) {
                arr[0] = i;
                arr[1] = hm.get(val);
                return arr;
            }
        }
        return arr;
    }
}
