class Solution {

    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int val : arr) set.add(val);
        for (int val : arr) {
            if (set.contains(val - 1)) {
                continue;
            } else {
                int len = 1;
                int temp = val + 1;
                while (set.contains(temp) == true) {
                    len++;
                    temp++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }
}
