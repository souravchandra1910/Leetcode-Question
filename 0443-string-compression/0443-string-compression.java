class Solution {

    public int compress(char[] arr) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            char ch1 = arr[i];
            char ch2 = arr[i - 1];
            if (ch1 == ch2) {
                cnt++;
            } else {
                sb.append(ch2);
                if (cnt > 1) {
                    sb.append(cnt);
                }
                cnt = 1;
            }
        }
        sb.append(arr[arr.length - 1]);
        if (cnt > 1) sb.append(cnt);
        // System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            arr[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
