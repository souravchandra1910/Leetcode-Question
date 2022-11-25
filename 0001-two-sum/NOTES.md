class Solution {

    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        if (arr.length == 0) {
            return ans;
        }
        // itterate all over the array and store int vs unka idx

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }

        // now for every el at a particular idx search for its counter part
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (hm.containsKey(diff) && hm.get(diff) != i) { // if the map contains the counter part and its not equal to the element we are currently standing on then mark the ans
                ans[0] = i;
                ans[1] = hm.get(diff);
            }
        }
        return ans;
    }
}
