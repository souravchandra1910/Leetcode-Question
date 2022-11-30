class Solution {
    public int majorityElement(int[] arr) {
        int el = 0, cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                cnt++;
            } else if (cnt == 0) {
                el = arr[i];
                cnt = 1;
            } else {
                cnt--;
            }
        }
        cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) cnt++;
        }
        if (cnt > (arr.length / 2)) return el;
        return -1;
    }
}
