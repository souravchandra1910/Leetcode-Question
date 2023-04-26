class Solution {
    public int addDigits(int num) {
        int t=num;
        int sum=0;
        while(t>9){
            while(t!=0){
                sum+=t%10;
                t/=10;
            }
            t=sum;
            sum=0;
        }
        return t;
    }
}