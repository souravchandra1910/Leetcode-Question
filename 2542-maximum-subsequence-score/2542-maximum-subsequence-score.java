class Solution {

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        List<int[]> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new int[] { nums1[i], nums2[i] });
        }
        Collections.sort(al, (a, b) -> Integer.compare(b[1], a[1]));
        long sum = 0;
        long max = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(al.get(i)[0]);
            sum += al.get(i)[0];
            if (pq.size() > k) {
                sum -= pq.poll();
            }
            if (pq.size() == k) max = Math.max(sum * 1L * al.get(i)[1], max);
        }
        return max;
    }
}
