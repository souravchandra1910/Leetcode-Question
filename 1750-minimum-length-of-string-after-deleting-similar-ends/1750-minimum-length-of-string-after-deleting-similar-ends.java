class Solution {

    public int minimumLength(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char ch1 = arr[i];
            char ch2 = arr[j];
            if (ch1 == ch2) {
                while (i < j && ch1 == arr[i]) {
                    i++;
                }
                while (i <= j && ch2 == arr[j]) {
                    j--;
                }
            } else {
                return j - i + 1;
            }
        }

        return j - i + 1;
    }
}
