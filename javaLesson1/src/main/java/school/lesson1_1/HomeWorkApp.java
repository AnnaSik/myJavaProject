package school.lesson1_1;
// 1, 6
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

// 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // 3

    public static void checkSumSign(){
    int a = 10;
    int b = 5;
    int sum = a + b;

    if (sum >= 0) {
        System.out.println("Сумма положительная");
    } else {
        System.out.println("Сумма отрицательная");
    }

    // 4

    public static void printColor(){
    int value = 333;

    if (value <= 0) {
    System.out.println("Красный");}
    else if (value > 0 && value <= 100) {
        System.out.println("Желтый");
    } else if (value > 100) {
        System.out.println("Зеленый");
    }

// 5

 public static void compareNumbers(){
    int a = 10;
    int b = 5;
    if (a >= b) {
        System.out.println("a >= b");
    } else {
        System.out.println("a < b");
    }
}
}