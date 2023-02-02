class Solution {

    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        printAllSubsequences(arr.length-1, arr, al, ans);
        return ans;
    }

    private static void printAllSubsequences(int idx, int[] arr, List<Integer> al, List<List<Integer>> ans) {
        if (idx == -1) {
            List<Integer> temp = new ArrayList<>(al);
            ans.add(temp);
            return;
        }
        // not pick
        printAllSubsequences(idx - 1, arr, al, ans);
        //		 pick
        al.add(arr[idx]);
        printAllSubsequences(idx - 1, arr, al, ans);
        al.remove(al.size() - 1);
    }
}
