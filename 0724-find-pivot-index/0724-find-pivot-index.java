class Solution {

    public int pivotIndex(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int lsum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (lsum == sum) {
                return i;
            }
            lsum += arr[i];
        }
        return -1;
    }
}
