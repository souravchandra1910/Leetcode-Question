class Solution {

    public int minStoneSum(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (k-- > 0) {
            int val = pq.poll();
            int d = val - val / 2;
            pq.add(d);
        }

        int sum = 0;
        while (pq.size() > 0) {
            sum += pq.poll();
        }
        return sum;
    }
}
