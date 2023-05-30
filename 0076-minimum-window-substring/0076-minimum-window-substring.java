class Solution {

    public String minWindow(String s, String t) {
        String ans = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) + 1);
        }
        int mct = 0;
        int dmct = t.length();
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //aquire until mct<dmct
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.getOrDefault(ch, 0) <= hm.getOrDefault(ch, 0)) {
                mct++;
            }
            if (mct < dmct) {
                continue;
            } else {
                while (mct == dmct) {
                    // mark ans and release;
                    String pans = s.substring(j, i + 1);
                    if (ans.length() == 0 || pans.length() < ans.length()) {
                        ans = pans;
                    }
                    char ch1 = s.charAt(j);
                    int freq = map.get(ch1);
                    if (freq == 1) {
                        map.remove(ch1);
                    } else {
                        map.put(ch1, freq - 1);
                    }
                    j++;
                    if (map.getOrDefault(ch1, 0) < hm.getOrDefault(ch1, 0)) {
                        mct--;
                    }
                }
            }
        }
        return ans;
    }
}
