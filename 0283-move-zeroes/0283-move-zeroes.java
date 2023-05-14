class Solution {
    //Algorithm is quite simple and involves the following steps
    // 1)place both the pointers at 0th index and start iteration with one pointer
    // 2)whenever the element is zero just do i++
    // 3)whenever the element is non zero swap the ith and jth element in the array and increment there indices
    
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0; 
        while (i < nums.length) {
            if (nums[i] == 0) i++; 
            else {
                swap(nums, i, j);
                i++;
                j++;
               }
          }
      } 

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
//  j
// [0,1,0,3,12]
//    i
//    j
// [1,0,0,3,12]
//        i
//      j 
// [1,3,0,0,12]
//           i
          
// [1,3,12,0,0,0]
