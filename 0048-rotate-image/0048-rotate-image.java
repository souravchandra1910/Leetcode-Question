class Solution {

    public void rotate(int[][] arr) {
        // transpose(arr);
        // reverse(arr);
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                ans[j][n - i - 1] = arr[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = ans[i][j];
            }
        }
    }
    //     public void transpose(int[][] arr) {
    //         int n = arr.length;
    //         int m = arr[0].length;

    //         for (int i = 0; i < n; i++) {
    //             for (int j = i; j < m; j++) {
    //                 int temp = arr[i][j];
    //                 arr[i][j] = arr[j][i];
    //                 arr[j][i] = temp;
    //             }
    //         }
    //     }

    //     public void reverse(int[][] arr) {
    //         for (int i = 0; i < arr.length; i++) {
    //             int lo = 0;
    //             int hi = arr[i].length - 1;
    //             while (lo < hi) {
    //                 int temp = arr[i][lo];
    //                 arr[i][lo] = arr[i][hi];
    //                 arr[i][hi] = temp;
    //                 lo++;
    //                 hi--;
    //             }
    //         }
    //     }
}
