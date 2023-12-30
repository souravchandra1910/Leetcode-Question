class Solution {

    public boolean makeEqual(String[] words) {
        if (words.length <= 1) return true;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            for (char ch : str.toCharArray()) {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }

        for (char key : hm.keySet()) {
            int freq = hm.get(key);
            if (freq % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
