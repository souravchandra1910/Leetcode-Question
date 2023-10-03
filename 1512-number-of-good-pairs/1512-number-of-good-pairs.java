class Solution {

    public int numIdenticalPairs(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        return cnt;
    }
}
