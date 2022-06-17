package school.lesson2;

public class Task4App {
    public static void main(String[] args) {
        writeText("Hello, World!", 4);
    }

    public static void writeText(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }
}
