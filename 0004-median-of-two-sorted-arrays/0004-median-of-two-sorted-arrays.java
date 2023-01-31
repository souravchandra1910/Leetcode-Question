class Solution {

    public double findMedianSortedArrays(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
               if(a[i]<b[j]){
                   ans[k++]=a[i++];
               }else{
                   ans[k++]=b[j++];
               }
        }
        while(i<a.length){
            ans[k++]=a[i++];
        }
        while(j<b.length){
            ans[k++]=b[j++];
        }
        
        double median=0.0;
        int middle=ans.length/2;
        if(ans.length%2==0){
            median=(ans[middle-1]+ans[middle])/2.0;
        }else{
            median=ans[middle]*1.0;
        }
        return median;
    }
}
