class FrequencyTracker {
    HashMap<Integer, Integer> hm;
    int []map;

    public FrequencyTracker() {
        this.hm = new HashMap<>();
        this.map=new int[100002];
    }

    public void add(int num) {
        if (hm.containsKey(num) == true) {
           map[hm.get(num)]--;
        }
        hm.put(num, hm.getOrDefault(num, 0) + 1);
        map[hm.get(num)]++;
       
    }

    public void deleteOne(int num) {
        int freq = hm.getOrDefault(num, 0);
        if (freq == 0) return;
        map[freq]--;
        if(freq==0){
            hm.remove(num);
        }else{
            hm.put(num,freq-1);
            map[freq-1]++;
        }
    }

    public boolean hasFrequency(int freq) {
        return map[freq]>0;
    }
}
/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */
