class Solution {

    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    public void transpose(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public void reverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lo = 0;
            int hi = arr[i].length - 1;
            while (lo < hi) {
                int temp = arr[i][lo];
                arr[i][lo] = arr[i][hi];
                arr[i][hi] = temp;
                lo++;
                hi--;
            }
        }
    }
}
