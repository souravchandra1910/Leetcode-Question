class Solution {

    public char nextGreatestLetter(char[] arr, char x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        char ans = arr[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            int val = (int) arr[mid];
            if (val > x) {
                ans = (char) val;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
