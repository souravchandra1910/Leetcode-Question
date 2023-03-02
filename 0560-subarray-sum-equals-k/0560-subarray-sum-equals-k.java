class Solution {

    public int subarraySum(int[] nums, int k) {
        // idea is to keep on calculating prefix sum and store it in the map
        // if map.contains(k-sum)==true
        // cnt++;

        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, cnt = 0;
        hm.put(0, 1);
        for (int val : nums) {
            sum += val;
            if (hm.containsKey(sum - k) == true) {
                cnt += hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}
