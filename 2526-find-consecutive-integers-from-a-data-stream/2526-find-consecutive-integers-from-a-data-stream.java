class DataStream {
    int size;
    int i = 0, j = 0;
    int val;

    public DataStream(int value, int k) {
        this.size = k;
        this.val = value;
    }

    public boolean consec(int num) {
        if (num == val) {
            i++;
            if (i - j > size) j++;
            if (i - j == size) {
                return true;
            } else {
                return false;
            }
        } else {
            //acquire karna yaha se suru hoga
            j = i;
            return false;
        }
    }
}
/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
