class Solution {

    public String longestCommonPrefix(String[] str) {
       if(str.length==0)return "";
       if(str.length==1)return str[0];
       Arrays.sort(str);
      //why sorting?
     // it is only required to check lexographically largest and smallest strings
        int len=str[0].length();
        int i=0;
        for(;i<len;i++){
            if(str[0].charAt(i)!=str[str.length-1].charAt(i))break;
        }
        return str[0].substring(0,i);
    }
}
