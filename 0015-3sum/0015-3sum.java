class Solution {

    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int val = -(arr[i] + arr[j]);
                if (set.contains(val) == true) {
                    List<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(val);
                    Collections.sort(al);
                    ans.add(al);
                }
                set.add(arr[j]);
            }
        }
        List<List<Integer>> a = new ArrayList<>(ans);
        return a;
    }
}
