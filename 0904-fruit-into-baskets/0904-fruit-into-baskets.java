class Solution {

    public int totalFruit(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = -1;
        int j = -1;
        int max = 0;
        while (true) {
            boolean f1 = false;
            boolean f2 = false;
            while (i < arr.length - 1) {
                i++;
                f1 = true;
                int val = arr[i];
                hm.put(val, hm.getOrDefault(val, 0) + 1);
                if (hm.size() == 3) break; else {
                    int len = i - j;
                    if (len > max) {
                        max = len;
                    }
                }
            }
            while (j < i && hm.size() != 2) {
                j++;
                f2 = true;
                int val = arr[j];
                int freq = hm.get(val);
                if (freq == 1) {
                    hm.remove(val);
                } else {
                    hm.put(val, freq - 1);
                }
            }
            if (f1 == false && f2 == false) break;
        }
        return max;
    }
}
