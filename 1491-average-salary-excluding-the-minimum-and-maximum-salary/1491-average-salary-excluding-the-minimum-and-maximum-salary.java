class Solution {

    public double average(int[] arr) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        long sum = 0L;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max || arr[i] == min) {
                continue;
            } else {
                sum += arr[i];
            }
        }
        int l = arr.length - 2;

        double a = sum / (l * 1.0);
        return a;
    }
}
