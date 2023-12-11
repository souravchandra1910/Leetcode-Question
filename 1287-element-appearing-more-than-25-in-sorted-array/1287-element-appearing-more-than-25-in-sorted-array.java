class Solution {

    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : arr) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }
        int ans = 0;
        for (int key : hm.keySet()) {
            if (hm.get(key) > arr.length / 4) {
                ans = key;
            }
        }
        return ans;
    }
}
