class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            int deltaSouth = 2 * (numRows - 1 - i);
            int deltaNorth = 2 * i;
            int idx = i;
            boolean south = true;
            while (idx < s.length()) {
                char ch = s.charAt(idx);
                sb.append(ch);
                if (i == 0) {
                    idx += deltaSouth;
                } else if (i == numRows - 1) {
                    idx += deltaNorth;
                } else {
                    if (south == true) {
                        idx += deltaSouth;
                    } else {
                        idx += deltaNorth;
                    }
                    south = !south;
                }
            }
        }
        return sb.toString();
    }
}
