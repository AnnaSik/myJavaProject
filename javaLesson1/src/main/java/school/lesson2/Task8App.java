package school.lesson2;

public class Task8App {
    public static void main(String args[]) {
        int [][] table = new int [4][4];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
}