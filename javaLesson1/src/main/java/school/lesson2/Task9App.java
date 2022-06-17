package school.lesson2;

public class Task9App {
    public static void main(String[] args) {
        fillMass(6,10);
    }

    public static void fillMass(int len, int initialValue) {
        int[] num = new int [len];
        for(int i = 0; i<len; i++) {
            num[i]=initialValue;
            System.out.print("["+i+"]"+"-"+ num[i]+" ");
        }
    }
}
