class Solution {
    public int numSteps(String s) {
        int ans=0;
        while(s.length()>1){
            if(s.charAt(s.length()-1)=='0'){
                s=s.substring(0,s.length()-1);
                ans++;
                continue;
            }else{
                char []arr=s.toCharArray();
                boolean flag=false;
                for(int i=arr.length-1;i>=0;i--){
                    if(arr[i]=='0'){
                        arr[i]='1';
                        flag=true;
                        break;
                    }
                    arr[i]='0';
                }
                s=String.valueOf(arr);
                if(flag==false){
                    s="1"+s;
                }
                ans++;
            }
        }
        return ans;
    }
}