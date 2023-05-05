class Solution {

    public int maxVowels(String s, int k) {
        int maxCnt = 0;
        int j = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch) == true) {
                cnt++;
            }
            if (i - j + 1 == k) {
                maxCnt = Math.max(maxCnt, cnt);
                char ch1 = s.charAt(j);
                j++;
                if (isVowel(ch1) == true) cnt--;
            }
        }
        return maxCnt;
    }

    boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
