

class SummaryRanges {
    private TreeSet<Integer> set;
    public SummaryRanges() {
        set = new TreeSet<>();  
    }
    
    public void addNum(int value) {
        set.add(value); 
    }
    
    public int[][] getIntervals() {
        if (set.isEmpty()) {       
            return new int[0][];   
        }

        List<int[]> intervals = new ArrayList<>();
        int start = set.first();
        int end = set.first();

        for (int v : set) {
            if (v == start) {   
                continue;       
            } else if (v == end + 1) {
                end = v;
            } else {
                intervals.add(new int[] {start, end});  
                start = end = v;    
            }
        }

        intervals.add(new int[] {start, end});
        return intervals.toArray(new int[0][]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */