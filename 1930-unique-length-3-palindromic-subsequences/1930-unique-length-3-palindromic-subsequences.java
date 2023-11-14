class Solution {

    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> last = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            first.put(ch, i);
        }
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            last.put(ch, i);
        }

        int cnt = 0;
        for (char ch : first.keySet()) {
            int f = first.get(ch);
            int l = last.get(ch);
            if (l - f + 1 < 3) continue; else {
                Set<Character> set = new HashSet<>();
                for (int j = f + 1; j < l; j++) {
                    char c = s.charAt(j);
                    set.add(c);
                }
                // System.out.println(set);
                cnt += set.size();
            }
        }
        return cnt;
    }
}
