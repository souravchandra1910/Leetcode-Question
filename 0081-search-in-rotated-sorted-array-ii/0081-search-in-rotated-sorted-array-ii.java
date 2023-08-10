class Solution {

    public boolean search(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                ans = mid;
                break;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            //left half is sorted
            if (arr[low] <= arr[mid]) {
                if (x >= arr[low] && x <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] <= arr[high]) {
                if (x >= arr[mid] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return ans != -1;
    }
}
// 0 1 2 3 4
// 1 0 1 1 1
// l   m   h
//   l m h
