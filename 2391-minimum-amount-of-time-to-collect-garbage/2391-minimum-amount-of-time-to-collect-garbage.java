class Solution {

    public int garbageCollection(String[] arr, int[] nums) {
        int n = arr.length;
        List<Integer> al = new ArrayList<>();
        al.add(0);
        for (int val : nums) al.add(val);
        int m = -1, g = -1, p = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i].contains("M") == true) m = i;
            if (arr[i].contains("G") == true) g = i;
            if (arr[i].contains("P") == true) p = i;
        }
        // System.out.println(m + " " + p + " " + g);
        int ans = 0;
        for (int i = 0; i <= m; i++) {
            ans += al.get(i);
            if (arr[i].contains("M") == true) {
                for (char ch : arr[i].toCharArray()) {
                    if (ch == 'M') ans++;
                }
            }
        }
        for (int i = 0; i <= g; i++) {
            ans += al.get(i);
            if (arr[i].contains("G") == true) {
                for (char ch : arr[i].toCharArray()) {
                    if (ch == 'G') ans++;
                }
            }
        }
        for (int i = 0; i <= p; i++) {
            ans += al.get(i);
            if (arr[i].contains("P") == true) {
                for (char ch : arr[i].toCharArray()) {
                    if (ch == 'P') ans++;
                }
            }
        }
        return ans;
    }
}
