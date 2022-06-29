package school.lesson4;

public class Animal {
    protected String type;
    protected String name;
    protected int maxDistance;
    protected int maxSwimDistanсe;
    public Animal(String type, String name, int maxDistance, int maxSwimDistanсe) {
        this.type = type;
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxSwimDistanсe = maxSwimDistanсe;
    }

    public void run(int runDistance) {
        if (runDistance <= maxDistance)
            System.out.println(type+" "+ name+ " пробежал "+runDistance+" м");
        else System.out.println(type+" "+ name+ " не может бегать так далеко");
    }
    public void swim(int swimDistance) {
        if (swimDistance <= maxSwimDistanсe)
            System.out.println(type+" "+ name+ " проплыл "+swimDistance+" м");
        else System.out.println(type+" "+ name+ " не может проплыть эту дистанцию");
    }
}