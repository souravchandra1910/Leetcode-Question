class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
         List<Integer>list=new ArrayList<>();
        int carry=0;
        for(int j=A.length-1;j>=0;j--){
            
           int rem=K%10; 
           int sum=carry;
           sum=sum+A[j]+rem;
           list.add(sum%10); 
           carry=sum/10;
           K=K/10; 
            
            
        }
        
        K=K+carry;     
        while(K>0){
            int rem=K%10;
            list.add(rem);
            K=K/10;
        }
        
        
        Collections.reverse(list);
        
        
        
        
        
        return list;
        
        
    }}