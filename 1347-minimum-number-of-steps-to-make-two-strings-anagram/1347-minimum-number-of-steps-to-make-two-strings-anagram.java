class Solution {

    public int minSteps(String s, String t) {
        int[] map = new int[26];
        for (char ch : s.toCharArray()) {
            map[ch - 'a']++;
        }
        int[] map2 = new int[26];
        for (char ch : t.toCharArray()) {
            map[ch - 'a']--;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (map[i] < 0) cnt += Math.abs(map[i]);
        }
        return cnt;
    }
}
