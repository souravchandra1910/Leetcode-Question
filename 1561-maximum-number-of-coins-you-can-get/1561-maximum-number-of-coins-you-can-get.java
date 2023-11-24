class Solution {

    public int maxCoins(int[] arr) {
        Arrays.sort(arr);
        //idea is to pick the smallest for bob and second largest for Sourav
        int i = 0;
        int j = arr.length - 2;
        int ans = 0;
        while (i < j) {
            ans += arr[j];
            j -= 2;
            i++;
        }
        return ans;
    }
}
