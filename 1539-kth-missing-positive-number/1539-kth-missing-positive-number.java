class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean []a=new boolean[5001];
        for(int i=0;i<arr.length;i++){
            a[arr[i]]=true;
        }
        for(int i=1;i<5001;i++){
            if(a[i]==false)k--;
            if(k==0)return i;
        }
        return 0;
    }
}