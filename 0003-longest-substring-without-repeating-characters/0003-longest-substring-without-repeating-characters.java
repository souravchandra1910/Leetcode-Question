class Solution {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int j = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            if (hm.get(ch) == 2) {
                while (j < i) {
                    char ch1 = s.charAt(j);
                    int freq = hm.get(ch1);
                    if (freq == 1) {
                        hm.remove(ch1);
                        j++;
                    } else {
                        hm.put(ch1, freq - 1);
                        j++;
                        break;
                    }
                }
            }
            int len = (i - j + 1);
            max = Math.max(len, max);
        }

        return max;
    }
}
