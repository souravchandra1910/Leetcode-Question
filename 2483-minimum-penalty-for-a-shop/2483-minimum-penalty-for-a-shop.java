class Solution {

    public int bestClosingTime(String str) {
        int idx=-1;
        int max=0;
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='Y')sum++;
            else{
                sum--;
            }
            if(sum>max){
                max=sum;
                idx=i;
            }
        }
        return idx+1;
    }
}
