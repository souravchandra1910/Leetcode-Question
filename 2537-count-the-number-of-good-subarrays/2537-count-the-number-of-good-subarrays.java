class Solution {

    public long countGood(int[] nums, int k) {
        long ans = 0L;
        int pairs = 0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0, j = 0; i < nums.length; i++) {
            pairs += hm.getOrDefault(nums[i], 0);
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            if (pairs >= k) {
                while (j <= i && pairs >= k) {
                    ans += (nums.length - i);
                    int freq = hm.get(nums[j]);
                    if (freq == 1) {
                        hm.remove(nums[j]);
                    } else {
                        hm.put(nums[j], freq - 1);
                        pairs -= freq - 1;
                    }
                   
                    j++;
                }
            }
        }
        return ans;
    }
}
