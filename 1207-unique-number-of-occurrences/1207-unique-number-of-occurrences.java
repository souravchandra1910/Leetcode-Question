class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            set.add(arr[i]);
        }
        Set<Integer> s = new HashSet<>(hm.values());
        return set.size() == s.size();
    }
}
