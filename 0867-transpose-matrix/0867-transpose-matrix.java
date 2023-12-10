class Solution {

    public int[][] transpose(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = mat[j][i];
            }
        }
        return arr;
    }
}
