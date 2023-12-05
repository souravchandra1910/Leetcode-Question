class Solution {

    public int numberOfMatches(int n) {
        int m = 0;
        while (n >= 2) {
            if (n % 2 == 1) {
                m++;
            }
            n = n / 2;
            m += n;
        }
        return m;
    }
}
