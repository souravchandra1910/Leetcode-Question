class DataStream {
    int k;
    int val;
    int i = 0, j = 0;

    public DataStream(int value, int k) {
        this.val = value;
        this.k = k;
    }

    public boolean consec(int num) {
        if (num == val) {
            if (i - j + 1 == k) return true; else if (i - j + 1 > k) {
                j++;
            } else {
                i++;
            }
        } else j = i;
        return false;
    }
}
/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
