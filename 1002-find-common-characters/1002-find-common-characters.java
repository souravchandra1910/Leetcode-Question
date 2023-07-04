class Solution {

    public List<String> commonChars(String[] words) {
        //1st create a map using 1st string
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : words[0].toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        //from 2nd string check what is not matching and remove it from the map
        for (int i = 1; i < words.length; i++) {
            String s = words[i];
            HashMap<Character, Integer> hm1 = new HashMap<>();
            for (char ch : s.toCharArray()) {
                hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
            }
            HashMap<Character, Integer> temp = new HashMap<>();
            for (char key : hm.keySet()) {
                if (hm1.containsKey(key) == true) {
                    temp.put(key, Math.min(hm.get(key), hm1.get(key)));
                }
            }
            hm = temp;
        }
        List<String> al = new ArrayList<>();
        for (char key : hm.keySet()) {
            int freq = hm.get(key);
            while (freq--> 0) {
                al.add(key+"");
            }
        }
        return al;
    }
}
