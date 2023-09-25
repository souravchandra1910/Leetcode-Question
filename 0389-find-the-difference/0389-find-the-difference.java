class Solution {

    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            if (i == a.length || a[i] != b[i]) return b[i];
        }
        return a[0];
    }
}
