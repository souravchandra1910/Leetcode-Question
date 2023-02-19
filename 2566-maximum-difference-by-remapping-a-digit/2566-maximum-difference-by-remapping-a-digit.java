class Solution {
    public int minMaxDifference(int num) {
        String n = Integer.toString(num);
        char toReplace = '9';
        for (char c : n.toCharArray()) {
            if (c != '9') {
                toReplace = c;
                break;
            }
        }
        
        String maxStr = n.replace(toReplace, '9');
        int max = Integer.parseInt(maxStr);
        
        String minStr = n.replace(n.charAt(0), '0');
        int min = Integer.parseInt(minStr);
        
        return max - min;
        
    }
}