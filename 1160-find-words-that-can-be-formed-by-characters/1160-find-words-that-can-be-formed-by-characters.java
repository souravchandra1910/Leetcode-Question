class Solution {

    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : chars.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        // System.out.println(hm);
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            // System.out.println(map);
            boolean flag = false;
            for (char key : map.keySet()) {
                if (map.get(key) <= hm.getOrDefault(key, 0)) {} else {
                    flag = true;
                    break;
                }
            }
            if (!flag) ans += str.length();
        }
        return ans;
    }
}
