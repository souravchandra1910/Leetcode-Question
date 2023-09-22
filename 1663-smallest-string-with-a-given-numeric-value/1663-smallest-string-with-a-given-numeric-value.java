class Solution {

    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) arr[i] = 'a';
        k -= n;
        for (int i = n - 1; i >= 0; i--) {
            if (k <= 25) {
                arr[i] = (char) (k + 'a');
                k = 0;
                break;
            } else {
                arr[i] = 'z'; 
                k -= 25;
            }
            if (k == 0) break;
        }
        return String.valueOf(arr);
    }
}
