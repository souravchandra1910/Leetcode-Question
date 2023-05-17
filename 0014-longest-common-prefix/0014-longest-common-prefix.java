class Solution {

    public String longestCommonPrefix(String[] str) {
        if (str.length == 0) return "";
        if (str.length == 1) return str[0];
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str);
        int len = str[0].length();
        int i = 0;
        System.out.println(Arrays.toString(str));
        for (; i < len; i++) {
            if (str[0].charAt(i) != str[str.length - 1].charAt(i)) break;
        }
        return str[str.length - 1].substring(0, i);
    }
}
