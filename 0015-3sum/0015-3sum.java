class Solution {

    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; else {
                int j = i + 1;
                int k = n - 1;
                // my i will be a constant and j and k will be acting as two pointers
                while (j < k) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum < 0) {
                        j++;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        List<Integer> al = new ArrayList<>();
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[k]);
                        ans.add(al);
                        j++;
                        k--;
                        while (j < k && arr[j] == arr[j - 1]) j++;
                        while (j < k && arr[k] == arr[k + 1]) k--;
                    }
                }
            }
        }
        return ans;
    }
}
