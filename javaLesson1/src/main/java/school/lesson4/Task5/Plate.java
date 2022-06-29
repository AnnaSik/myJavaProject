package school.lesson4.Task5;

public class Plate {
    private int countFood;

    Plate(int countFood) {
        this.countFood = countFood;
    }

    public String toString() {
        return "" + countFood;
    }

    void decreaseFood(int appetite) {
        if (countFood >= appetite) {
            countFood -= appetite;
        }
    }

    int getAmountOfFood() {
        return countFood;
    }

    void increaseFood(int amount) {
        countFood += amount;
    }
}
