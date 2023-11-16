class Solution {

    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        List<String> al = new ArrayList<>();
        f(nums, 0, n, al, new StringBuilder());
        for (String str : al) {
            Boolean flag = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i].equals(str)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) return str;
        }
        return "";
    }

    private void f(String[] nums, int i, int n, List<String> al, StringBuilder sb) {
        if (i == n) {
            if (sb.length() != 0) {
                String str = sb.toString();
                al.add(str);
            }
            return;
        }
        sb.append("0");
        f(nums, i + 1, n, al, sb);

        sb.deleteCharAt(sb.length() - 1);

        sb.append("1");
        f(nums, i + 1, n, al, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
