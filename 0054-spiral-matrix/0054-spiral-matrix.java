class Solution {

    public List<Integer> spiralOrder(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int max = n * m;
        List<Integer> al = new ArrayList<>();
        int cnt = 0;
        int row = 0;
        int col = 0;
        int mrow = n - 1;
        int mcol = m - 1;
        while (cnt < max) {
            for (int i = row, j = col; j <= mcol && cnt < max; j++) {
                al.add(arr[i][j]);
                cnt++;
            }
            row++;

            for (int i = row, j = mcol; i <= mrow && cnt < max; i++) {
                al.add(arr[i][j]);
                cnt++;
            }
            mcol--;
            for (int i = mrow, j = mcol; j >= col && cnt < max; j--) {
                al.add(arr[i][j]);
                cnt++;
            }
            mrow--;
            for (int i = mrow, j = col; i >= row && cnt < max; i--) {
                al.add(arr[i][j]);
                cnt++;
            }
            col++;
        }
        return al;
    }
}
// left to right cols are increasing rows are const & row++
//top to bottom row++,col const & mcol--
//right to left cols-- ,row const & mrow--
// bottom to top row==,col const & col++
