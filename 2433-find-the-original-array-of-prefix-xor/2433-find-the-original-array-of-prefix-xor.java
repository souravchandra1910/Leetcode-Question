class Solution {

    public int[] findArray(int[] arr) {
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = arr[i - 1] ^ arr[i];
        }
        return pre;
    }
}
