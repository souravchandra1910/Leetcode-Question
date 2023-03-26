class Solution {

    public int countPrimes(int n) {
        int N = n + 10;
        boolean[] primes = new boolean[N];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < N; i++) {
            if (primes[i] == true) {
                for (int j = 2 * i; j < N; j += i) {
                    primes[j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i] == true) cnt++;
        }
        return cnt;
    }
}
