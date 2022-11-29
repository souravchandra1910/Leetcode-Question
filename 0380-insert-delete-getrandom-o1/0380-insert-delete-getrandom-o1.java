class RandomizedSet {
    HashSet<Integer> hset;
    List<Integer> list;
    Random rm;
    public RandomizedSet() {
        hset = new HashSet<>();
        list = new ArrayList<>();
        rm = new Random();
    }
    
    public boolean insert(int val) {
        if (hset.contains(val) == false) {
            list.add(val);
            hset.add(val);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean remove(int val) {
        if (hset.contains(val)) {
            list.remove(new Integer(val));
            hset.remove(val);
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {
        int idx = rm.nextInt(hset.size());
        return list.get(idx);
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
