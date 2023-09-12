class Solution {

    public int minDeletions(String s) {
        int[] map = new int[26];
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            map[arr[i] - 'a']++;
        }
        Arrays.sort(map); // 0(26log26)
        // System.out.println(Arrays.toString(map));
        Set<Integer> set = new HashSet<>();
        set.add(map[25]);
        int cnt = 0;
        for (int i = 24; i >= 0; i--) {
            if (map[i] == 0) break;
            int val = map[i];
            if (set.contains(val) == true) {
                while (set.contains(val) == true && val > 0) {
                    val--;
                    cnt++;
                }
                if (val == 0) continue;
            }
            set.add(val);
        }
        return cnt;
    }
}
