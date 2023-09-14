class Solution {

    public int maxProduct(int[] arr) {
        if (arr.length == 1) return arr[0];
        int preprd = 1, sufprd = 1, maxprd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (preprd == 0) {
                preprd = arr[i];
            } else {
                preprd *= arr[i];
            }
            maxprd = Math.max(preprd, maxprd);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sufprd == 0) {
                sufprd = arr[i];
            } else {
                sufprd *= arr[i];
            }
            maxprd = Math.max(sufprd, maxprd);
        }
        return maxprd;
    }
}
