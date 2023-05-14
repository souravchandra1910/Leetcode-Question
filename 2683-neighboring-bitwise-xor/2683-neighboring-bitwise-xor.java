class Solution {

    public boolean doesValidArrayExist(int[] d) {
        int n = d.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= d[i];
        }
        return xor == 0;
    }
}
