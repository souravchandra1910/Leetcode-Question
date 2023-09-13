class Solution {

    public boolean judgeCircle(String moves) {
        char[] arr = moves.toCharArray();
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'L') {
                x--;
            } else if (arr[i] == 'R') {
                x++;
            } else if (arr[i] == 'D') {
                y--;
            } else if (arr[i] == 'U') {
                y++;
            }
        }
        return x == 0 && y == 0;
    }
}
