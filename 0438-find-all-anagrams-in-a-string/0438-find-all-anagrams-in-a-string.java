class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length())return new ArrayList<>();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            hm1.put(p.charAt(i), hm1.getOrDefault(p.charAt(i), 0) + 1);
        }
        for (int i = 0; i < p.length(); i++) {
            hm2.put(s.charAt(i), hm2.getOrDefault(s.charAt(i), 0) + 1);
        }
        int j = 0;
        List<Integer> al = new ArrayList<>();
        if (check(hm1, hm2)) al.add(j);
        for (int i = p.length(); i < s.length(); i++) {
            //release
            char ch = s.charAt(j);
            int freq = hm2.get(ch);
            if (freq == 1) {
                hm2.remove(ch);
            } else {
                hm2.put(ch, freq - 1);
            }
            j++;

            //acquire

            char ch1 = s.charAt(i);
            hm2.put(ch1, hm2.getOrDefault(ch1, 0) + 1);
            //check

            if (check(hm1, hm2)) al.add(j);
        }
        return al;
    }

    private boolean check(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2) {
        return hm1.equals(hm2);
    }
}
