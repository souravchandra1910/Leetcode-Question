class Solution {

    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor = 0;
        int n = nums1.length;
        int m = nums2.length;
        System.out.println(n + " " + m);
        if (n % 2 == 0 && m % 2 == 0) {
            return 0;
        } else if (n % 2 == 0 && m % 2 == 1) {
            for (int i = 0; i < n; i++) xor ^= nums1[i];
        } else if (n % 2 == 1 && m % 2 == 0) {
            for (int i = 0; i < m; i++) {
                xor ^= nums2[i];
            }
        } else {
            for (int i = 0; i < n; i++) xor ^= nums1[i];
            for (int i = 0; i < m; i++) xor ^= nums2[i];
        }
        return xor;
    }
}
