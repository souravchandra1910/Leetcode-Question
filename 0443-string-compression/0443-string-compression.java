class Solution {

    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                cnt++;
            } else {
                sb.append(chars[i - 1]);
                if (cnt > 1) sb.append(cnt);
                cnt = 1;
            }
        }
        sb.append(chars[chars.length - 1]);
        if (cnt > 1) sb.append(cnt);
        for (int i = 0; i < sb.length(); i++) chars[i] = sb.charAt(i);
        return sb.length();
    }
}
