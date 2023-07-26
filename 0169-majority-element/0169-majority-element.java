class Solution {

    public int majorityElement(int[] arr) {
        int el = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (arr[i] == el) cnt++; else cnt--;
        }
        cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) cnt++;
        }
        return cnt > arr.length / 2 ? el : -1;
    }
}
