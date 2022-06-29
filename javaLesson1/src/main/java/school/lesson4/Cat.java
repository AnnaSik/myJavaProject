package school.lesson4;

public class Cat extends Animal {

    public Cat(String type, String name, int maxDistance,  int maxSwimDistanсe) {
        super(type, name, maxDistance, maxSwimDistanсe);
    }
    public void swim(int maxSwimDistanсe) {
        System.out.println("Коты не плавают");
    }
}