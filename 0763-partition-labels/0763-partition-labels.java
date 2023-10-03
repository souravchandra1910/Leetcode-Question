class Solution {

    public List<Integer> partitionLabels(String s) {
        // the idea is to find a window beyond which there is no occurance of any character in the window
        // in order to do this we have to calculate the last occurances of that characters and
        // split the string accordingly

        // step 1: store the last occurance of every character
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, i);
        }
        int j = -1;
        int max = 0;
        //step2 : iterate over the array check the maximum index of last occurance of character
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            max = Math.max(hm.get(ch), max);
            if (max == i) {
                al.add(i - j);
                j = i;
            }
        }
        return al;
    }
}
