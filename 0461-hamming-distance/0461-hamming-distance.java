class Solution {

    public int hammingDistance(int x, int y) {
        int cnt = 0;
        String s1 = Binary(x);
        String s2 = Binary(y);
        for (int i = 0; i < 31; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 != ch2) cnt++;
        }
        return cnt;
    }

    private String Binary(int x) {
        int a = 31;
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            a--;
            int val = x % 2;
            sb.append(val);
            x = x / 2;
        }
        for (int i = 0; i < a; i++) {
            sb.append(0);
        }

        return sb.reverse().toString();
    }
}
