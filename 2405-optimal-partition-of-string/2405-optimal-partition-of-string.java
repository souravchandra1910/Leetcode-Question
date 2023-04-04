class Solution {

    public int partitionString(String s) {
        int cnt = 1;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch - 'a'] != 0) {
                arr = new int[26];
                cnt++;
            }
            arr[ch - 'a']++;
        }
        return cnt;
    }
}
