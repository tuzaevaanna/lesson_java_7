public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int amount) {
        int diff = food - amount;
        if (diff < 0) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }
}



