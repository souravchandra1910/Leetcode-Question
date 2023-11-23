class Solution {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> al = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int st = l[i];
            int et = r[i];
            if (blackBox(nums, st, et) == true) {
                al.add(true);
            } else {
                al.add(false);
            }
        }
        return al;
    }

    private boolean blackBox(int[] nums, int st, int et) {
        List<Integer> al = new ArrayList<>();
        for (int i = st; i <= et; i++) {
            al.add(nums[i]);
        }
        Collections.sort(al);
        int diff = al.get(1) - al.get(0);
        for (int i = 2; i < al.size(); i++) {
            int d = al.get(i) - al.get(i - 1);
            if (d != diff) return false;
        }
        return true;
    }
}
