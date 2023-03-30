class Solution {

    public boolean isScramble(String s1, String s2) {
        Map<String, Boolean> map = new HashMap<>();
        return isScramble(s1, s2, map);
    }

    public boolean isScramble(String s1, String s2, Map<String, Boolean> map) {
        if (s1.equals(s2)) return true;
        int s1Array[] = new int[26];
        int s2Array[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Array[s1.charAt(i) - 'a']++;
            s2Array[s2.charAt(i) - 'a']++;
        }

        String key = s1 + "-" + s2;

        if (map.containsKey(key)) return map.get(key);

        for (int i = 0; i < 26; i++) if (s1Array[i] != s2Array[i]) {
            map.put(key, false);
            return map.get(key);
        }

        boolean flag = false;

        for (int i = 1; i < s1.length(); i++) {
            if (isScramble(s1.substring(0, i), s2.substring(0, i), map) && isScramble(s1.substring(i), s2.substring(i), map)) {
                flag = true;
                break;
            }

            if (isScramble(s1.substring(0, i), s2.substring(s1.length() - i), map) && isScramble(s1.substring(i), s2.substring(0, s1.length() - i), map)) {
                flag = true;
                break;
            }
        }

        map.put(key, flag);
        return map.get(key);
    }
}
