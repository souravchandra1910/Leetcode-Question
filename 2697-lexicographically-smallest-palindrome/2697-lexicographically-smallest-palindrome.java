class Solution {

    public String makeSmallestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2) {
                char c = (char) (Math.min(ch1 - 'a', ch2 - 'a') + 'a');
                int idx = ch1 == c ? j : i;
                sb.setCharAt(idx, c);
            }
            i++;
            j--;
        }
        return sb.toString();
    }
}
