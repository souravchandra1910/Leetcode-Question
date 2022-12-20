class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> arr) {
       ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        boolean []vis=new boolean[arr.size()];
        for(int i=0;i<arr.size();i++){
            ArrayList<Integer>al=new ArrayList<>();
            if(vis[i]==false){
                dfs(vis,arr,al,i);
                ans.add(al);
            }
        }
        return ans.size()==1;
    }
    public void dfs(boolean []vis,List<List<Integer>> arr,ArrayList<Integer>al,int node){
        vis[node]=true;
        al.add(node);
        for(int it:arr.get(node)){
            if(vis[it]==false){
                dfs(vis,arr,al,it);
            }
        } 
    }
    
}