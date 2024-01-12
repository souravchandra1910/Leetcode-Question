class Solution {

    public boolean halvesAreAlike(String s) {
        int v1=countVowels(s.substring(0, s.length() / 2 ));
        int v2=countVowels(s.substring(s.length() / 2 ));
      
        return v1==v2;
    }

    private int countVowels(String s) {
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                cnt++;
            }
        }
        return cnt;
    }
}
