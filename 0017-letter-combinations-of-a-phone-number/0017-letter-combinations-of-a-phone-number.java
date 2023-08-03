class Solution {

    public List<String> letterCombinations(String str) {
        List<String> al = new ArrayList<>();
        String[] codes = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        helper(0,str, "", al, codes);
        if(al.get(0)=="")al.remove("");
        return al;
    }

    private void helper(int i, String str, String ans, List<String> al, String[] arr) {
        if (i==str.length()) {
            al.add(ans);
            return;
        }
      	String s = arr[(str.charAt(i) - '0')];
        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);
            helper(i + 1, str, ans + ch, al, arr);
        }
    }
}
