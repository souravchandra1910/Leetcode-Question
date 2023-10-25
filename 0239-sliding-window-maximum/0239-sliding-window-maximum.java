class Solution {

    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        int j = 0;
        Deque<Integer> mq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // 1) if the element is beyond the window
            if (mq.size() > 0 && mq.peek() == i - k) {
                mq.pollFirst();
            }
            // 2) Remove all smaller elements
            while (mq.size() > 0 && arr[mq.peekLast()] < arr[i]) {
                mq.pollLast();
            }
            mq.offerLast(i);
            if (i - j + 1 == k) {
                ans[j++] = arr[mq.peekFirst()];
            }
        }
        return ans;
    }
}
