class Solution {
    public int maxIceCream(int[] arr, int coins) {
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(coins-arr[i]>=0){
                cnt++;
                coins-=arr[i];
            }else{
                break;
            }
        }
        return cnt;
    }
}