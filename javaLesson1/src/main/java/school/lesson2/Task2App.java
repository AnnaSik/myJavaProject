package school.lesson2;

public class Task2App {
    public static void main(String[] args) {
        isIntPositiveOrNegative(10);}
    public static void isIntPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
