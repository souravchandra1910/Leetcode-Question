class Solution {

    public long maximumSumOfHeights(List<Integer> arr) {
        int n = arr.size();
        long max = 0;
        for (int i = 0; i < n; i++) {
            long val=bringMax(new ArrayList<>(arr), i,n);
            if(val>max){
                max=val;
                // System.out.println(max+" "+i);
            }
        }
        return max;
    }

    private long bringMax(List<Integer> arr, int idx,int n) {
        long sum = arr.get(idx);
        if (idx - 1 >= 0) {
            int val=Math.min(arr.get(idx),arr.get(idx-1));
            sum+=val;
            arr.set(idx-1,val);
        }
        for (int i = idx - 2; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                sum += arr.get(i + 1);
                arr.set(i, arr.get(i + 1));
            } else {
                sum += arr.get(i);
            }
        }
        if (idx + 1 < n) {
           int val=Math.min(arr.get(idx),arr.get(idx+1));
            sum+=val;
            arr.set(idx+1,val);
        }
        // System.out.println(sum);
        for (int i = idx + 2; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                sum += arr.get(i - 1);
                arr.set(i, arr.get(i - 1));
            } else {
                sum += arr.get(i);
            }
            // System.out.println(sum + "  loop 2");
        }
        return sum;
    }
}
