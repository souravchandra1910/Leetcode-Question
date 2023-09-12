class Solution {

    public int minDeletions(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> al = new ArrayList<>(hm.values());
        Collections.sort(al);
        // System.out.println(al);

        Set<Integer> set = new HashSet<>();

        set.add(al.get(al.size() - 1));
        int cnt = 0;
        for (int i = al.size() - 2; i >= 0; i--) {
            int val = al.get(i);
            if (set.contains(val) == true) {
                while (set.contains(val) == true) {
                    val--;
                    cnt++;
                     if(val==0){
                        break;
                    }
                }
            }
            if(val!=0)set.add(val);
        }
        return cnt;
    }
}
