class Solution {

    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        long ans = 0L;
        boolean negative = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0) {
                if (ch == '-') {
                    negative = true;
                    continue;
                } else if (ch == '+') {
                    continue;
                }
            }
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                ans = ans * 10 + digit;

                if (negative == true) {
                    long nans = -ans;
                    if (nans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                } else if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            } else break;
        }
        if (negative == true) ans = -ans;
        return (int) ans;
    }
}
