class Solution {

    public int minFlips(String target) {
        int n = target.length();
        int ans = target.charAt(0) - '0';
        for (int i = 1; i < n; i++) {
            char curr = target.charAt(i);
            char prev = target.charAt(i - 1);
            if (curr != prev) ans++;
        }
        return ans;
    }
}
/*
"101010"

"111111"
"100000"
"101111"
"101000"
"101011"
"101010"
*/
