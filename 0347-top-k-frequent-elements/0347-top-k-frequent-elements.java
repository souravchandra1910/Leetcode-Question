class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []ans=new int[k];
        if(nums.length==0){
            return ans;
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:nums){
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b));
        for(int val:hm.keySet()){
        pq.add(val);
        if(pq.size()>k){
            pq.remove();
        }
    }
   int i=0;
    while(pq.size()>0){
        int a=pq.remove();
       ans[i++]=a;
    }
  
   return ans;
    }
}