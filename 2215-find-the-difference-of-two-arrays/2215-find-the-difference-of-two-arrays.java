class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ans=new ArrayList<>();
        Set<Integer>a=new HashSet<>();
        Set<Integer>b=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            b.add(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            if(b.contains(nums1[i])==true){
                b.remove(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(a.contains(nums2[i])==true){
                a.remove(nums2[i]);
            }
        }
        
       List<Integer>al=new ArrayList<>(a);
        List<Integer>bl=new ArrayList<>(b);
        ans.add(al);
        ans.add(bl);
        return ans;
        
    }
}