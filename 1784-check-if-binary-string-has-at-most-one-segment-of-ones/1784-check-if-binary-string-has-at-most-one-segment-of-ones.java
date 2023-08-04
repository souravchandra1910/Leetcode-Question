class Solution {

    public boolean checkOnesSegment(String s) {
        boolean flag = false;
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '1') {
                if (flag == false) {
                    while (i < s.length() && s.charAt(i) == '1') {
                        i++;
                    }
                    flag = true;
                    if (i<s.length() && s.charAt(i) == '0') i++;
                } else return false;
            } else {
                i++;
            }
        }
        return true;
    }
}
