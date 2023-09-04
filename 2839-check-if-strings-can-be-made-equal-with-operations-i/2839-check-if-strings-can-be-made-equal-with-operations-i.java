class Solution {

    public boolean canBeEqual(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        int j = 2;
        for (int i = 0; i < s1.length() - 2; i++) {
            char ch1 = sb.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 == ch2) {
                j++;
                continue;
            }
            char t1 = sb.charAt(i);
            char t2 = sb.charAt(j);
            sb.setCharAt(i, t2);
            sb.setCharAt(j, t1);
            if (t2 != ch2) return false;
            j++;
        }
        return sb.toString().equals(s2);
    }
}
