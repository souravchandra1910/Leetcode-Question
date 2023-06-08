class Solution {
    public int countNegatives(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int row=n-1;
       int col=0;
       int cnt=0;
       while(row>=0 && col<m){
           if(grid[row][col]<0){
               cnt+=(m-col);
               row--;
           }else{
               col++;
           }
       }
      return cnt; 
    }
}