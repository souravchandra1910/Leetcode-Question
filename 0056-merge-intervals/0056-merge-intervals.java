class Solution {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> al = new ArrayList<>();
        for (int[] interval : intervals) {
            if (al.size() == 0) {
                al.add(interval);
            } else {
                int prev_end_time = al.get(al.size() - 1)[1];
                int curr_start_time = interval[0];
                int curr_end_time = interval[1];
                if (curr_start_time <= prev_end_time) {
                    al.get(al.size() - 1)[1] = Math.max(prev_end_time, curr_end_time);
                } else {
                    al.add(interval);
                }
            }
        }
        return al.toArray(new int[al.size()][2]);
    }
}
