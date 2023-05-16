class DataStream {
    int k;
    int val;
    int i = 0, j = 0;

    public DataStream(int value, int k) {
        this.k = k;
        this.val = value;
    }

    public boolean consec(int num) {
        if (num == val) {
            i++;
            while (i - j > k) {
                j++;
            }
            if (i - j== k) {
                return true;
            } else return false;
        } else {
            j=i;
            return false;
        }
    }
}
/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
