class Solution {

    public String addBinary(String s1, String s2) {
        StringBuilder res = new StringBuilder();

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int ival = i >= 0 ? s1.charAt(i) - '0' : 0;
            int jval = j >= 0 ? s2.charAt(j) - '0' : 0;
            int sum = ival + jval + carry;

            int val = sum % 2;

            res.append(val);

            carry = sum / 2;

            i--;
            j--;
        }

        if (carry != 0) {
            res.append(carry);
        }

        res.reverse();

        return res.toString();
    }
}
