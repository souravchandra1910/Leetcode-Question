class Solution {

    public int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int cnt = 0;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == k) {
                cnt++;
                i++;
                j--;
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }
        }
        return cnt;
    }
}
