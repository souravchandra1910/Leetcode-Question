class Solution {

    public List<Boolean> kidsWithCandies(int[] arr, int e) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) max = Math.max(max, arr[i]);
        List<Boolean> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + e >= max) al.add(true); else al.add(false);
        }
        return al;
    }
}
