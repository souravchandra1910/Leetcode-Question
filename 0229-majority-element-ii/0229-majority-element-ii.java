class Solution {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int el1 = 0, el2 = 0, cnt1 = 0, cnt2 = 0;
        for (int val : nums) {
            if (el1 == val) {
                cnt1++;
            } else if (el2 == val) {
                cnt2++;
            } else if (cnt1 == 0) {
                el1 = val;
                cnt1++;
            } else if (cnt2 == 0) {
                el2 = val;
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int val : nums) {
            if (el1 == val) cnt1++; else if (el2 == val) cnt2++;
        }
        if (cnt1 > nums.length / 3) al.add(el1);
        if (cnt2 > nums.length / 3) al.add(el2);
        return al;
    }
}
