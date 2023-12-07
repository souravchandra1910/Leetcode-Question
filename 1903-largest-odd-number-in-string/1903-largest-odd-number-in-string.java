class Solution {

    public String largestOddNumber(String num) {
        String ans = "";
        int idx = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            int val = ch - '0';
            if (val % 2 == 1) {
                idx = i;
                break;
            }
        }
        String s = num.substring(0, idx + 1);
        int v = ans.compareTo(s);
        if (v < 0) ans = s;
        return ans;
    }
}
