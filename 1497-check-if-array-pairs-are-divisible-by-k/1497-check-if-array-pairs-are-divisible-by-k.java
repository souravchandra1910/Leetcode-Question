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
            int x = ((val % k) + k) % k;
            if (x == 0) {
                if (hm.get(x) % 2 == 1) return false;
            } else if (x * 2 == k) {
                if (hm.get(x) % 2 == 1) return false;
            } else {
                int f1=hm.get(x);
                int f2=hm.getOrDefault(k-x,0);
                if(f1!=f2)return false;
            }
        }
        return true;
    }
}
