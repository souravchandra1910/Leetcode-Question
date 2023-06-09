class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        int ans = 'z' - 'a';
        boolean flag = true;
        while (low <= high) {
            int mid = (low + high) / 2;
            int val = letters[mid] - 'a';
            int t = target - 'a';
            if (val > t) {
                ans = val;
                high = mid - 1;
                flag = false;
            } else {
                low = mid + 1;
            }
        }
        if (flag) return letters[0];
        return (char) (ans + 'a');
    }
}
