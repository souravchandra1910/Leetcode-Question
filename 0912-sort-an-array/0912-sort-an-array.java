class Solution {

    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = (lo + hi) / 2;
        int[] left = mergeSort(arr, lo, mid);
        int[] right = mergeSort(arr, mid + 1, hi);
        int[] merged = merge2SortedArrays(left, right);
        return merged;
    }

    public static int[] merge2SortedArrays(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int[] ans = new int[a.length + b.length];
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }
}
