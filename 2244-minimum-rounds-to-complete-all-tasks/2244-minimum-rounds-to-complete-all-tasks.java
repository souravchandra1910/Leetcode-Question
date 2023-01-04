class Solution {
    public int minimumRounds(int[]arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
          hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int key:hm.keySet()){
            if(hm.get(key)<2)return -1;
        }
        int cnt=0;
      for(int i=0;i<arr.length;i++){
           if(hm.containsKey(arr[i])==false)continue;
          int freq=hm.get(arr[i]);
         
          if(freq==3 || freq==2){
              cnt++;
              hm.remove(arr[i]);
          }else{
              cnt++;
              int rem=freq % 2;
              int rem1=freq%3;
              if(rem==1 || rem1==0)
              hm.put(arr[i],freq-3);
              else hm.put(arr[i],freq-2);
          }
          
      }
        return cnt;

    }
}