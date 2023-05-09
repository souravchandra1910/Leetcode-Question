class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int minr = 0; // minimum row idx
        int maxr = matrix.length - 1; // maximum row idx
        int minc = 0; // minimum col idx
        int maxc = matrix[0].length - 1; // maximum col idx
        int total = n * m;
        int count = 0;

        while (count < total) {
            // left to right cols are increasing rows are const
            for (int i = minr, j = minc; j <= maxc && count < total; j++) {
                al.add(matrix[i][j]);
                count++;
            }
            minr++; // this is done to avoid pick the last element twice

            //top to bottom rows are increasing ,cols are const
            for (int i = minr, j = maxc; i <= maxr && count < total; i++) {
                al.add(matrix[i][j]);
                count++;
            }
            maxc--;
            //right to left cols decreasing ,rows are const
            for (int i = maxr, j = maxc; j >= minc && count < total; j--) {
                al.add(matrix[i][j]);
                count++;
            }
            maxr--;

            // bottom to top rows are decreasing ,cols are const
            for (int i = maxr, j = minc; i >= minr && count < total; i--) {
                al.add(matrix[i][j]);
                count++;
            }
            minc++;
        }
        return al;
    }
}
