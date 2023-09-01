class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        //1st step check whether that total gas jo hai wo total cost se kam to nahi
        int tgas = 0, tcost = 0;
        for (int i = 0; i < gas.length; i++) {
            tgas += gas[i];
            tcost += cost[i];
        }
        if (tgas < tcost) return -1;

        tgas = 0;
        int ans = 0;
        for (int i = 0; i < cost.length; i++) {
            tgas += gas[i];
            tgas -= cost[i];
            if (tgas < 0) {
                ans = i + 1;
                tgas = 0;
            }
        }
        return ans;
    }
}
