class Solution {

    public int addMinimum(String word) {
        int n = word.length(), ans = 0;

        for (int i = 0; i < n;) {
            String s = "";
            if (i + 1 < n) s = word.substring(i, i + 2); else s = word.charAt(i) + "";

            if (i + 2 < n && word.substring(i, i + 3).equals("abc")) {
                i += 3;
            } else if (s.equals("ab") || s.equals("bc") || s.equals("ac")) {
                ans += 1;
                i += 2;
            } else {
                i++;
                ans += 2;
            }
        }
        return ans;
    }
}
