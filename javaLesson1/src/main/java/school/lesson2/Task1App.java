package school.lesson2;

public class Task1App {
    public static void main(String[] args) {
        System.out.println(isSumFrom10to20(1, 9));}
    public static boolean isSumFrom10to20(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }
}