class Solution {

    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        for (char key : hm.keySet()) {
            pq.add(key);
        }
        while (pq.size() > 0) {
            char ch = pq.poll();
            int val = hm.get(ch);
            for (int i = 0; i < val; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
