class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int val : arr) set.add(val);
        int max = 0;
        for (int val : arr) {
            if (set.contains(val - 1) == true) {
                continue;
            } else {
                int curr_len_seq = 1;
                int temp = val + 1;
                while (set.contains(temp) == true) {
                    curr_len_seq++;
                    temp++;
                }
                max = Math.max(curr_len_seq, max);
            }
        }
        return max;
    }
}
