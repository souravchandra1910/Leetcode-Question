class Solution {

    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            hm.put(words[i], hm.getOrDefault(words[i], 0) + 1);
        }
        int len = 0;
        boolean flag=false;
        for (String key : hm.keySet()) {
            String r = reverse(key);
            if (key.equals(r)) { //aa
                int freq=hm.get(key);
                len+=freq/2;
                if(freq%2==1)flag=true;
            }
                else{
                if (hm.containsKey(r) == true) {
                    len += Math.min(hm.get(r), hm.get(key));
                    hm.put(r, 0);
                    hm.put(key, 0);
                }
            }
        }
        len=len*4;
        if(flag==true)len+=2;
        return len;
    }

    public String reverse(String str) {
        return str.charAt(1) + "" + str.charAt(0);
    }
}
