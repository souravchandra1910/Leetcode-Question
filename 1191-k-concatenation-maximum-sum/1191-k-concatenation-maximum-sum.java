class Solution {
    int m = (int) 1e9 + 7;

    public int kConcatenationMaxSum(int[] arr, int k) {
      int res=0;
      long sum=sum(arr);
      if(k==1){
          return (int)kadane(arr)%m;
      }else if(sum<0){
          res=(int)kadaneOfTwo(arr)%m;
      }else{
          res=(int)(kadaneOfTwo(arr)%m+((k-2)%m*sum%m))%m;
      }
        return Math.max(0,res);
    }

    long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    long kadane(int[] arr) {
        long max = arr[0], curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (curr > 0) curr += arr[i]; else curr = arr[i];
            if (curr > max) max = curr;
        }
        return max;
    }

    long kadaneOfTwo(int[] arr) {
        int[] a = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) a[i] = arr[i];
        for (int i = 0; i < arr.length; i++) a[i + arr.length] = arr[i];
        return kadane(a);
    }
}
