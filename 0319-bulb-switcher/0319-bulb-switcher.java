class Solution {
    public int bulbSwitch(int n) {
        List<Integer>al=new ArrayList<>();
      for(int i=1;i*i<=n;i++){
          al.add(i*i);
      }
        return al.size();
    }
}