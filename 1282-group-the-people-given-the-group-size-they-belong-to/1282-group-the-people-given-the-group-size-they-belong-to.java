class Solution {

    public List<List<Integer>> groupThePeople(int[] arr) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        int i = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for (int val : arr) {
            if (hm.containsKey(val) == false) {
                hm.put(val, new ArrayList<>());
            }
            List<Integer> al = hm.get(val);
            al.add(i);
            if (al.size() == val) {
                ans.add(al);
                hm.remove(val);
            }
            i++;
        }
        return ans;
    }
}
