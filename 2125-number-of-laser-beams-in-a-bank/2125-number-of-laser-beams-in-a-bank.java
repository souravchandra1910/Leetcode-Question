class Solution {

    public int numberOfBeams(String[] arr) {
        int row = 0;
        boolean f = false;
        int prev = 0;
        for (int i = 0; i < arr.length; i++) {
            for (char ch : arr[i].toCharArray()) {
                if (ch == '1') {
                    f = true;
                    prev++;
                }
            }
            if (f == true) {
                row = i;
                break;
            }
        }
        int ans = 0;
        for (int i = row + 1; i < arr.length; i++) {
            int curr = 0;
            for (char ch : arr[i].toCharArray()) {
                if (ch == '1') {
                    f = true;
                    curr++;
                }
            }
            if (curr != 0) {
                ans += (curr * prev);
                prev = curr;
            }
        }
        return ans;
    }
}
