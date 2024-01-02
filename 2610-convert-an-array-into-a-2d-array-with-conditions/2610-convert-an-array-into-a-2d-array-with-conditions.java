class Solution {

    public List<List<Integer>> findMatrix(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]) == true) {
                set = new HashSet<>();
                set.add(nums[i]);
                cnt++;
            } else {
                set.add(nums[i]);
            }
        }
        boolean[] vis = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < cnt && c < nums.length; i++) {
            List<Integer> al = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (vis[j] == false && al.contains(nums[j]) == false) {
                    al.add(nums[j]);
                    c++;
                    vis[j] = true;
                }
            }
            ans.add(al);
        }

        return ans;
    }
}
