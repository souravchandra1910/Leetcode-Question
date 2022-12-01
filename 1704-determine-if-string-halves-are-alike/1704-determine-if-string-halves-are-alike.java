class Solution {

    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int c1 = count_vowels(s.substring(0, n / 2 ));
        int c2 = count_vowels(s.substring(n / 2 ));
        return c1 == c2;
    }

    int count_vowels(String s) {
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                cnt++;
            }
        }
        return cnt;
    }
}
