package school.lesson4.Task5;

import org.jetbrains.annotations.NotNull;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public String toString() {
        return "Кот " + name + " аппетит: " + appetite + " сытость: " + isFull;
    }

    void eat(@NotNull Plate plate) {
        if (plate.getAmountOfFood() >= appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
}
