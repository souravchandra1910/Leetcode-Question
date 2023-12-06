class Solution {

    public int totalMoney(int n) {
        int sevens = n / 7;
        int rem = n % 7;
        int ans = 0;
        int start = 0;
        for (int i = 1; i <= sevens; i++) {
            int val = sum(start + 7);
            val -= sum(start);
            ans += val;
            // System.out.println(start + "   " + val+"  "+i);
            start++;
        }
        // System.out.println(ans);

        for (int i = 1; i <= rem; i++) {
            ans += (start + i);
        }
        return ans;
    }

    private int sum(int n) {
        return (n * (n + 1)) / 2;
    }
}
