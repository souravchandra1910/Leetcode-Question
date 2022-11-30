class Solution {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int el1 = 0, el2 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) {
                cnt1++;
            } else if (nums[i] == el2) {
                cnt2++;
            } else if (cnt1 == 0) {
                el1 = nums[i];
                cnt1++;
            } else if (cnt2 == 0) {
                el2 = nums[i];
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) cnt1++; else if (nums[i] == el2) cnt2++;
        }
        int n = nums.length;
        if (cnt1 > n / 3) al.add(el1);
        if (cnt2 > n / 3) al.add(el2);
        return al;
    }
}
