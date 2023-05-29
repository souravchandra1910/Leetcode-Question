class ParkingSystem {
    int a, b, c;

    public ParkingSystem(int big, int medium, int small) {
        this.a = big;
        this.b = medium;
        this.c = small;
    }

    public boolean addCar(int ct) {
        if (ct == 1) {
            a--;
            return a >= 0;
        } else if (ct == 2) {
            b--;
            return b >= 0;
        } else {
            c--;
            return c >= 0;
        }
    }
}
/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
