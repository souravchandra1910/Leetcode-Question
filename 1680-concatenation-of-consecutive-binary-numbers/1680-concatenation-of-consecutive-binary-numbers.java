class Solution {
    public int concatenatedBinary(int n) {
       int m=(int)1e9+7;
       // String s="1101110010111011110001001101010111100";
       //  System.out.println(s.length());
       StringBuilder sb=new StringBuilder();
       for(int i=1;i<=n;i++){
          sb.append(Integer.toBinaryString(i));  
       }
        char []arr=sb.toString().toCharArray();
        int idx=arr.length-1;
        long val=0;
        long pow=1;
        while(idx>=0){
         val+=(arr[idx]-'0')*pow;
         val%=m;
         pow=pow<<1;
         pow%=m;
         idx--;
        }
        return (int)val;
      
    }
}