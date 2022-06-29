package school.lesson4.Task5;

public class Main {
    public static void main(String[] args) {
        Cat[] x = {new Cat("Том", 25), new Cat("Барсик", 30), new Cat("Пушок", 26)};
        Plate plate = new Plate(80);
        for (Cat i : x) {
            System.out.println(i);
        }
        System.out.println("Еды в тарелке: " + plate);
        System.out.println(" ");
        System.out.println("Коты кушают:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println("Осталось еды в тарелке: "+ plate);
        }
        System.out.println(" ");
        System.out.println("Увеличить количество еды в тарелке на 80");
        plate.increaseFood(80);
        System.out.println("Еды в тарелке: " + plate);
        System.out.println(" ");
        System.out.println("Коты кушают:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println("Осталось еды в тарелке: "+plate);
        }
    }
}
