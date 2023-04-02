class Solution {
    
    public int[] successfulPairs(int[] sp, int[] p, long s) {
        int[]arr=new int[sp.length];
        Arrays.sort(p);
        for(int i=0;i<sp.length;i++){
            int low=0;
            int high=p.length-1;
            int ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(p[mid]*1L*sp[i]>=s){
                    ans=p.length-mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            arr[i]=ans;
        }
        
        return arr;
    }
}