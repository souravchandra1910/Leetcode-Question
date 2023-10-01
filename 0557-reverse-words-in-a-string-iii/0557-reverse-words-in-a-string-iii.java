class Solution {

    public String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            StringBuilder temp = new StringBuilder(parts[i]);
            sb.append(temp.reverse() + " ");
        }
        return sb.toString().trim();
    }
}
