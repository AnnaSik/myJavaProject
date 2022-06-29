package school.lesson4;

public class AnimalApp {
    public static void main(String[] args) {
        Cat barsik = new Cat("Кот","Барсик", 200, 0);
        Cat pushok = new Cat ("Кот", "Пушок", 200, 0);
        Dog dog = new Dog("Собака", "Бим", 500, 10);
        barsik.run(200);
        pushok.run(250);
        dog.run(500);
        barsik.swim(3);
        pushok.swim(2);
        dog.swim(15);
    }
}