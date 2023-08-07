class Solution {

    public boolean searchMatrix(int[][] arr, int target) {
        int val = row(arr, target);
        if (val == -1) {
            return false;
        } else {
            return col(arr, val, target) != 0;
        }
    }

    public int row(int[][] arr, int target) {
        int r1 = 0;
        int r2 = arr.length - 1;
        int c2 = arr[0].length - 1, c1 = 0;
        while (r1 <= r2) {
            int mid = (r1 + r2) / 2;
            if (target >= arr[mid][c1] && target <= arr[mid][c2]) {
                return mid;
            } else if (target < arr[mid][c1]) {
                r2 = mid - 1;
            } else {
                r1 = mid + 1;
            }
        }
        return -1;
    }

    public int col(int[][] arr, int val, int target) {
        int low = 0;
        int high = arr[0].length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[val][mid] == target) return 1; else if (arr[val][mid] > target) high = mid - 1; else low = mid + 1;
        }
        return 0;
    }
}
