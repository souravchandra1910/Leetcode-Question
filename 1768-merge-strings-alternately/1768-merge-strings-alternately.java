class Solution {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        boolean f = false;
        while (i < word1.length() && j < word2.length()) {
            if (f) {
                sb.append(word2.charAt(j));
                j++;
            } else {
                sb.append(word1.charAt(i));
                i++;
            }
            f = !f;
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}
