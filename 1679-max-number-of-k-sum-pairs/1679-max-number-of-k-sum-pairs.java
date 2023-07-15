class Solution {

    public int maxOperations(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int p1 = arr[i];
            int p2 = k - arr[i];
            if (hm.containsKey(p2) == true) {
                if (p1 == p2) {
                    ans += hm.get(p1) / 2;
                    hm.remove(p1);
                } else {
                    ans += Math.min(hm.get(p1), hm.get(p2));
                    hm.remove(p2);
                    hm.remove(p1);
                }
            }
        }
        hm.clear();
        return ans;
    }
}
