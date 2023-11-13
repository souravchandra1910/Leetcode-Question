class Solution {

    public String sortVowels(String s) {
        List<Character> al = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                al.add(ch);
            } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                al.add(ch);
            }
        }
        Collections.sort(al, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.append(al.remove(al.size() - 1));
            } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sb.append(al.remove(al.size() - 1));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
