class Solution {

    public int removeDuplicates(int[] arr) {
        int i = 1;
        int j = 1;
        for (; i < arr.length; i++) {
            if (arr[i] == arr[j - 1]) continue; else {
                arr[j++] = arr[i];
            }
        }
        return j;
    }
}
