class Solution {

    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxLen = 1;
        int min_char = 0;
        int[] cnt = new int[2];
        int j = 0;
        for (int i = 0; i < answerKey.length(); i++) {
            char ch = answerKey.charAt(i);
            if (ch == 'T') {
                cnt[0]++;
            } else {
                cnt[1]++;
            }
            min_char = Math.min(cnt[0], cnt[1]);
            if (min_char > k) {
                while (min_char > k) {
                    char ch1 = answerKey.charAt(j);
                    if (ch1 == 'T') {
                        cnt[0]--;
                    } else {
                        cnt[1]--;
                    }
                    j++;
                    min_char = Math.min(cnt[0], cnt[1]);
                }
            }
            maxLen = Math.max(maxLen, i - j + 1);
        }
        return maxLen;
    }
}
