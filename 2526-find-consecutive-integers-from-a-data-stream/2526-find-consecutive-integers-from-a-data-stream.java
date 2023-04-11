class DataStream {
    int i = 0;
    int j = 0;
    int size;
    int val;

    public DataStream(int value, int k) {
        this.val = value;
        this.size = k;
    }

    public boolean consec(int num) {
        if (num == val) {
            if (i - j + 1 == size) {
                return true;
            } else if (i - j + 1 > size) {
                j++;
            } else {
                i++;
            }
        } else {
            j = i;
        }
        return false;
    }
}
/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
