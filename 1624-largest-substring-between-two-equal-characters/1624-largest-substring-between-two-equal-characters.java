class Solution {

    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for (char ch : s.toCharArray()) {
            int fi = s.indexOf(ch);
            int li = s.lastIndexOf(ch);
            max = Math.max(max, li - fi - 1);
        }
        return max;
    }
}
