class Solution {

    public int balancedString(String s) {
        int ans = s.length();
        int target = s.length() / 4;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        if (isBalanced(hm, target) == true) return 0;
        int i = 0;
        int j = 0;
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.get(ch) - 1);
            if (isBalanced(hm, target) == true) {
                int len = i - j + 1;
                ans = Math.min(len, ans);
                // release
                while (j <= i) {
                    char ch1 = s.charAt(j);
                    hm.put(ch1, hm.getOrDefault(ch1, 0) + 1);
                    j++;
                    if (isBalanced(hm, target) == true){
                        int l = i - j + 1;
                        ans = Math.min(l, ans);
                    }else break;
                }
            }
        }
        return ans;
    }

    boolean isBalanced(HashMap<Character, Integer> hm, int target) {
        for (int key : hm.values()) {
            if (key > target) return false;
        }
        return true;
    }
}
