class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        // 1st step check if the gas provided to us is > what it takes to make the distance

        int sum = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i];
            sum -= cost[i];
        }
        if (sum < 0) return -1;

        //step 2 check from where cost if not -ve and start from there
        int rem = 0;
        int ans = 0;
        for (int i = 0; i < gas.length - 1; i++) {
            rem += (gas[i] - cost[i]);
            if (rem < 0) {
                ans = i + 1;
                rem = 0;
            }
        }
        return ans;
    }
}
