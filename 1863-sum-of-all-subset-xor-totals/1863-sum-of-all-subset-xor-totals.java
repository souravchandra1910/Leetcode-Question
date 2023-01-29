class Solution {

    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        List<Integer> al = new ArrayList<>();
        int[] arr = new int[1];
        helper(0, n, al, nums, arr);
        return arr[0];
    }

    private void helper(int idx, int n, List<Integer> al, int[] nums, int[] arr) {
        if (idx == n) {
            if (al.size() == 0) return;
            List<Integer> bl = new ArrayList<>(al);

            int sum = 0;
            for (int val : bl) {
                sum = sum ^ val;
            }
            arr[0] += sum;
            return;
        }
        al.add(nums[idx]);
        helper(idx + 1, n, al, nums, arr);
        al.remove(al.size() - 1);
        helper(idx + 1, n, al, nums, arr);
    }
}
