class Solution {

    public List<String> buildArray(int[] arr, int n) {
        List<String> al = new ArrayList<>();
        int j = 0;
        for (int i = 1; i <= n && j < arr.length; i++) {
            al.add("Push");
            if (arr[j] == i) {
                j++;
            } else {
                al.add("Pop");
            }
        }
        return al;
    }
}
