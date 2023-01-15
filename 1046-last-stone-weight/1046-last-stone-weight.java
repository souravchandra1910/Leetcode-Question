class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:arr){
            pq.add(val);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            int diff=y-x;
            if(diff!=0)pq.add(diff);
            
        }
        return (pq.size()==0)?0:pq.poll();
    }
}