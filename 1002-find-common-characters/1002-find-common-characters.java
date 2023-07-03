class Solution {

    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : words[0].toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        List<String>al=new ArrayList<>();
        for(int i=1;i<words.length;i++){
            String s=words[i];
            HashMap<Character,Integer>hm1=new HashMap<>();
            for(char ch:s.toCharArray()){
                hm1.put(ch,hm1.getOrDefault(ch,0)+1);
            }
            HashMap<Character,Integer>hm2=new HashMap<>();
            for(char key:hm1.keySet()){
                if(hm.containsKey(key)){
                    hm2.put(key,Math.min(hm1.get(key),hm.get(key)));
                }
            }
            hm=hm2;
        }
        for(char key:hm.keySet()){
            int freq=hm.get(key);
            while(freq-->0){
                al.add(key+"");
            }
        }
        return al;
    }
}
