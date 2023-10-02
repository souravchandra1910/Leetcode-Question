class Solution {

    public boolean winnerOfGame(String str) {
        // just find no of consecutive a's and b's
        int c1 = 0, c2 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                while (i < str.length() && str.charAt(i) == 'A') {
                    cnt1++;
                    i++;
                    if (cnt1 >= 3) {
                        c1++;
                    }
                }
                cnt1 = 0;
                i--;
            } else {
                while (i < str.length() && str.charAt(i) == 'B') {
                    cnt2++;
                    i++;
                    if (cnt2 >= 3) {
                        c2++;
                    }
                }
                cnt2 = 0;
                i--;
            }
        }
        // System.out.println(c1 + " " + c2);
        return c1 > c2 ? true : false;
    }
}
