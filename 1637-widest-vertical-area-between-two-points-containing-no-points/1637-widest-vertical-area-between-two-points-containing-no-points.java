class Solution {

    public int maxWidthOfVerticalArea(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i][0] - arr[i - 1][0]);
        }
        return max;
    }
}
