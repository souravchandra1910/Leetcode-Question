class Solution {

    public int addMinimum(String word) {
        int ans = 0;
        char[] str = word.toCharArray();
        int i = 0, n = str.length;
        while (i < n) {
            if (str[i] == 'a') { // character at ith idx can either be a or b or c
                if (i + 1 < n && str[i + 1] == 'b') {
                    if (i + 2 < n && str[i + 2] == 'c') {
                        i += 3; //abc are in sequence
                    } else {
                        i += 2;
                        ans++; // ab are sequence and only c is needed to be added
                    }
                } else if (i + 1 < n && str[i + 1] == 'c') { // a,c are forming a sequence so b is to append in middle
                    i += 2;
                    ans += 1;
                } else { // a comes after a i.e aa
                    i++;
                    ans += 2;
                }
            } else if (str[i] == 'b') {
                if (i + 1 < n && str[i + 1] == 'c') { //bc is the sequence a is to added
                    i += 2;
                    ans += 1;
                } else {
                    i++; // b comes after b
                    ans += 2;
                }
            } else {
                i++; // c is sequence and a,b are to be added
                ans += 2;
            }
        }
        return ans;
    }
}
