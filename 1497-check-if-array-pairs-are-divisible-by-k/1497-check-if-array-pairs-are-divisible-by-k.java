class Solution {

    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : arr) {
            int rem = ((val % k) + k) % k;
            hm.put(rem, hm.getOrDefault(rem, 0) + 1);
        }

        //checks
        // 1)agar freq of x is abc then freq of k-x must also be abc
        // 2)if x==k-x hai then freq of must be even (x=k/2 and k-x=k/2)
        // 3)if rem==0 then freq must be even
        for (int val : arr) {
            int rem = ((val % k) + k) % k;
            if (rem == 0) {
                int freq = hm.get(rem);
                if (freq % 2 == 1) return false;
            } else if (rem * 2 == k) {
                int freq = hm.get(rem);
                if (freq % 2 == 1) return false;
            } else {
                int freq = hm.get(rem);
                int ofreq = hm.getOrDefault(k - rem, 0);
                if (freq != ofreq) return false;
            }
        }
        return true;
    }
}
