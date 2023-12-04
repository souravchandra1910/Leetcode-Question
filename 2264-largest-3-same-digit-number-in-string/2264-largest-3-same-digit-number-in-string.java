class Solution {

    public String largestGoodInteger(String str) {
        // iterate over the string find a window of size 3 and convert it into integer
        // do it for all windows of size 3 and find the maximum integer
        int j = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < str.length();) {
            char prev = str.charAt(j);
            char curr = str.charAt(i);
            if (prev == curr) {
                if (i + 1 < str.length() && str.charAt(i + 1) == prev) {
                    max = Math.max(max, Integer.parseInt(str.substring(j, i + 2)));
                    i = i + 2;
                    j = i - 1;
                } else {
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }
        String ans = "";
        if (max == 0) ans = "000"; else if (max <= Integer.MIN_VALUE) ans = ""; else ans = String.valueOf(max);
        return ans;
    }
}
