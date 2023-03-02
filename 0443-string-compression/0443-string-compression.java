class Solution {

    public int compress(char[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            char ch1 = arr[i];
            char ch2 = arr[i - 1];
            if (ch1 == ch2) {
                cnt++;
            } else {
                if (cnt > 1) {
                    sb.append(cnt);
                    sb.append(ch1);
                    cnt = 1;
                } else {
                    sb.append(ch1);
                    cnt = 1;
                }
            }
        }
        if (cnt > 1) {
            sb.append(cnt);
        }
        for(int i=0;i<sb.length();i++)arr[i]=sb.charAt(i);
        return sb.length();
    }
}
