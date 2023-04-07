class Solution {

    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0, idx = arr.length-1, j = arr.length-1;
        while (i <= j) {
            int sq1=nums[i] * nums[i] ;
            int sq2= nums[j] * nums[j];
            if(sq1>sq2){
                arr[idx--]=sq1;
                i++;
            }else{
                arr[idx--]=sq2;
                j--;
            }
        }
        return arr;
    }
}
