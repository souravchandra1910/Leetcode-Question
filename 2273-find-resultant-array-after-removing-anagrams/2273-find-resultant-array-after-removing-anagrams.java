class Solution {

    public List<String> removeAnagrams(String[] arr) {
        List<String> al = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, Integer> hm = new HashMap<>();
        for (int i = 0, k = 0; i < arr.length; i++) {
            String str = arr[i];
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            if (hm.containsKey(map) == false) {
                al.add(str);
            } else if (hm.containsKey(map) == true && (i - hm.get(map)) > 1) {
                al.add(str);
            }
            hm.put(map, i);
        }

        return al;
    }
}
