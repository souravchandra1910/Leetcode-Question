class Solution {
    HashMap<Character, Integer> hm;

    public boolean isAlienSorted(String[] arr, String order) {
        hm = new HashMap<>();
        //store every character of order in a map vs its index
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            hm.put(ch, i);
        }
        //get 1st mismatching character and compare which occurs first(if 1st then true  else false)
        for (int i = 1; i < arr.length; i++) {
            if (compare(arr[i - 1], arr[i]) == false) return false;
        }
        return true;
    }

    public boolean compare(String s1, String s2) {
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(j);
            if (ch1 != ch2) {
                if (hm.get(ch1) > hm.get(ch2)) {
                    return false;
                } else {
                    return true;
                }
            }
            i++;
            j++;
        }
        if (s1.length() > s2.length()) return false;
        return true;
    }
}
