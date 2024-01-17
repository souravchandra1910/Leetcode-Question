class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer>set=new HashSet<>();
        for (int key : hm.keySet()) {
           int val=hm.get(key);
            if(set.contains(val)){
                return false;
            }
            set.add(val);
        }
        return true;
    }
}
